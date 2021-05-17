import java.io.*;
import java.util.*;
class Arithmetic_Operations{
	static int a,b,c,o;
	public static void main(String args[]) throws InterruptedException{
		String con="yes";
		Scanner scr=new Scanner(System.in);
		System.out.println(" welcome for arthametic operations ");
		while(con.equals("yes")){
			while(true){
				System.out.println("1. addition ");
				System.out.println("2. subtraction");
				System.out.println("3. multiplication");
				System.out.println("4. division");
				System.out.print("enter your choose : ");
				try{
					o= scr.nextInt();
					switch(o){
						case 1:
							System.out.println("you choosen addition");
							System.out.println();
							Thread.sleep(2000);
							ele();
							System.out.println("the additioon of two values : "+(a+b));
							break;
						case 2:
							System.out.println("you choosen subtraction");
							System.out.println();
							Thread.sleep(3000);
							ele();
							System.out.println("the subtraction of two values : "+(a-b));
							break;
						case 3:
							System.out.println("you choosen multiplication");
							System.out.println();
							Thread.sleep(3000);
							ele();
							System.out.println("the multiplication of two values : "+(a*b));
							break;
						case 4:
							System.out.println("you choosen division");
							System.out.println();
							Thread.sleep(3000);
							ele();
							System.out.println("the division of two values : "+(double)(a/b));
							break;
						default:
							System.out.println("you entered wrong option select correct option");
							System.out.println();
					}
					if(o>4)
						continue;
					else
						break;
				}
				catch(InputMismatchException e){
					System.out.println("enter valid number");
					System.out.println();
					scr.nextLine();
					continue;
				}
			}
			System.out.println();
			System.out.println("if you want to continue enter yes otherwise no");
			con=scr.next().toLowerCase();
			System.out.println();
		}
	}
	public static void ele(){
		Scanner scr=new Scanner(System.in);
		while(true){
			try{
				System.out.print("enter the 'a' value : ");
				a=scr.nextInt();
				break;
			}
			catch(InputMismatchException m){
				System.out.println("enter valid number");
				System.out.println();
				scr.nextLine();
				continue;
			}
		}
		while(true){
			try{
				System.out.print("enter the 'b' value : ");
				b=scr.nextInt();
				if(o==4){
					if(b==0){
						System.out.println("don't enter second value zero");
						System.out.println();
						scr.nextLine();
						continue;
					}
				}
				break;
			}
			catch(InputMismatchException m){
				System.out.println("enter valid number");
				System.out.println();
				scr.nextLine();
				continue;
			}
		}
	}
}		
