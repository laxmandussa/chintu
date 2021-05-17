import java.util.*;
class Armstrong{
	public static void main(String[] args) {
		Scanner scr=new Scanner (System.in);
		int i,sum=0,r,count=0,m,t1,t2,n;
		String con="yes";
		while(con.equals("yes")){
			while(true){
				try{
					System.out.print("enter your number : ");
					n=scr.nextInt();
					break;
				}
				catch(InputMismatchException e){
					System.out.println("enter valid number");
					System.out.println();
					scr.nextLine();
					continue;
				}
			}
			t1=n;
			t2=n;
			while(t1!=0){
				count++;
				t1=t1/10;
			}
			while(n>0){
				m=1;
				r=n%10;
				for(i=1; i<=count; i++){
					m=m*r;
				}
				sum=sum+m;
				n=n/10;
			}
			if(t2==sum)
				System.out.println(t2+" is Armstrong");
			else
				System.out.println(t2+" is not Armstrong");

			System.out.println();
			count=0;
			sum=0;
			System.out.println("if you want continue enter yes otherwise no");
			con=scr.next().toLowerCase();
			System.out.println();
		}
	}
}
