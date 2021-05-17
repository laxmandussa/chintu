import java.util.*;
class Adding_Array_Of_Elements {
	public static void main(String[] args) {
		int n,i,sum=0;
		String con="yes";
		Scanner scr=new Scanner(System.in);
		while(con.equals("yes")){
			while(true){
				try{
					System.out.print("enter size of : ");
					n=scr.nextInt();
					System.out.println();
					break;
				}
				catch(InputMismatchException e){
					System.out.println("enter valid number");
					System.out.println();
					scr.nextLine();
					continue;
				}
			}
			int m[]=new int[n];
			for(i=0; i<n; i++){
				while(true){
					try{
						System.out.println("enter "+(i+1)+" number : ");
						m[i]=scr.nextInt();
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid number");
						System.out.println();
						scr.nextLine();
						continue;
					}
				}
			}
			
			System.out.println();
			System.out.println("the array elements: ");
			System.out.println(Arrays.toString(m));
			System.out.println();
			for(i=0; i<n; i++){
				sum=sum+m[i];
			}
			System.out.println("the addition "+sum);
			System.out.println();

			System.out.println("if you want to continue enter yes otherwise no");
			con=scr.next().toLowerCase();
			System.out.println();
		}
	}
}
