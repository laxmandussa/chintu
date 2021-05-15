import java.util.*;
class Checking_Prime_Number{
	static String con="yes";
	static int n;
	public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);

		while(con.equals("yes")){
			System.out.print("enter your number : ");
			try{
				n=sc.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println();
				System.out.println("enter valid number");
				sc.next();
				System.out.println();
				continue;
			}
			if(n==0||n==1){
				System.out.println();
				System.out.println(n+" is not a prime number");
				System.out.println();
			}
			else{
				System.out.println();
				int c=0;
				for(int i=2; i<n; i++){
					if(n%i==0){
						c++;
					}
				}
				if(c==0){
					System.out.print(n+" is a prime number");
				}
				else{
					System.out.print(n+" is not a prime number");
					c=0;
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("If you want to continue enter yes otherwise enter no: ");
			con=sc.next().toLowerCase();
			System.out.println();
		}
		System.out.println();
	}
}
