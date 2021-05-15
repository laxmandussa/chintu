import java.util.*;
class Printing_Prime_Numbers{
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
				System.out.println("enter more than 1");
				System.out.println();
				continue;
			}
			else{
				System.out.println();
				System.out.println("The prime numbers are: ");
				int c=0;
				for(int i=2; i<=n; i++){
					for(int j=2; j<i; j++){
						if(i%j==0){
							c++;
						}
					}
					if(c==0){
						System.out.print(i+" ");
					}
					else{
						c=0;
					}
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
