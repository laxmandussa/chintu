import java.util.*;
class Subtraction_Bunch_Of_Elements{
	static int sub;
	static String con="yes";
	public static void main(String[] args) {
		while(con.equals("yes")){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter numbers like(1-2): ");
			String num=sc.nextLine();
			System.out.println();
			if(num.isEmpty()){
				System.out.println("it is empty");
				System.out.println();
				continue;
			}
			num=num.replace(" ","");
			if(num.isEmpty()){
				System.out.println("it is empty");
				System.out.println();
				continue;
			}
			String ele[]=num.split("-");

			int m[]=new int[ele.length];
			try{
				for(int i=0; i<ele.length; i++){
				
					m[i]=Integer.parseInt(ele[i]);
				}
			}
			catch(Exception e){
				System.out.println("please enter valid numbers");
				System.out.println();
				continue;
			}
				
			for(int i=0; i<m.length; i++){
				sub=sub-m[i];
			}
			System.out.println("the subtraction "+sub);
			System.out.println();
			System.out.println("if you want to continue enter yes otherwise press any key");
			con=sc.nextLine().toLowerCase();
			System.out.println(); 
		}
	}
}
