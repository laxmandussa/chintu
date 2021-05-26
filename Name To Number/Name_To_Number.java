//Write a program to display the given name in number formate

import java.util.*;
class Name_To_Number{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String con="yes";
		while(con.equals("yes")){
			System.out.print("enter your name : ");
			String str=sc.nextLine().toLowerCase();
			System.out.println();
		
			System.out.println("The Given name: "+str);
			System.out.println();
			System.out.print("The Given name in Number Format: ");
			char chars[]=str.toCharArray();
			str="";
			for(int i=0; i<chars.length; i++){
				int k=1;
				for(char j='a'; j<='z'; j++){
					if(chars[i]==j){
						str=str+k+" ";
						break;
					}
					k++;
				}
			}
			System.out.println(str);
			System.out.println();
			System.out.println("if want to continue enter yes otherwise enter no: ");
			con=sc.nextLine().toLowerCase();
		}
	}
}
