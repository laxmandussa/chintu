package com.laxman.dussa;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadFileServlet")
public class DownloadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filepath="C:\\Users\\LAXMAN\\Desktop\\passphoto.jpg";
		File download=new File(filepath);
		FileInputStream fis=new FileInputStream(download);
		
		ServletContext context=getServletContext();
		String mimeType=context.getMimeType(filepath);
		if(mimeType==null) {
			mimeType="application/octet-stream";
		}
		response.setContentType(mimeType);
		response.setContentLength((int)download.length());
		String headerKey="Content-Disposition";
		String headerValue=String.format("attachment; filename=\"%s\"",download.getName());
		response.setHeader(headerKey,headerValue);
		OutputStream os=response.getOutputStream();
		byte[] buffer=new byte[4096];
		int bytesRead=-1;
		while((bytesRead=fis.read(buffer)) !=-1) {
			os.write(buffer,0,bytesRead);
		}
		fis.close();
		os.close();

	}
}