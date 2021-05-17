import java.util.*;
class MatrixAddition{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int m,n,p,q,i,j;
		String con="yes";
		while(con.equals("yes")){
			try{
				while(true){
					try{
						System.out.print("enter A matrix rows   : ");
						m=scr.nextInt();
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numer");
						scr.next();
						continue;
					}
				}
				while(true){
					try{
						System.out.print("enter A matrix colums : ");  
						n=scr.nextInt();
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numer");
						scr.next();
						continue;
					}
				}
				while(true){
					try{
						System.out.print("enter B matrix rows   : ");
						p=scr.nextInt();
						if(m!=p){
							System.out.println("A and B Matrix rows shold be same otherwise matrix addition not possible");
							scr.nextLine();
							continue;
						}
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numer");
						scr.nextLine();
						continue;
					}
				}
				while(true){
					try{
						System.out.print("enter B matrix colums : ");  
						q=scr.nextInt();
						if(n!=q){
							System.out.println("A and B Matrix columns shold be same otherwise matrix addition not possible");
							scr.nextLine();
							continue;
						}
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numer");
						scr.nextLine();
						continue;
					}
				}


				int a[][]=new int[m][n];
				while(true){
					try{
						System.out.println("enter A matrix values : ");
						for(i=0; i<m; i++){
							for(j=0; j<n;j++){
								a[i][j]=scr.nextInt();
							}
						}
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numbers");
						scr.nextLine();
						continue;
					}
				}

				System.out.println();
				int b[][]=new int[m][n];
				while(true){
					try{
						System.out.println("enter B matrix values : ");
						for(i=0; i<p; i++){
							for(j=0; j<q;j++){
								b[i][j]=scr.nextInt();
							}
						}
						break;
					}
					catch(InputMismatchException e){
						System.out.println("enter valid numbers");
						scr.nextLine();
						continue;
					}
				}

				System.out.println();
				System.out.println("the matrix A");
				for(i=0; i<m; i++){
					for(j=0; j<n;j++){
						System.out.print(a[i][j]+" ");
					}
					System.out.print("\n");
				}

				System.out.println();
				System.out.println("the matrix B");
				for(i=0; i<p; i++){
					for(j=0; j<q;j++){
						System.out.print(b[i][j]+" ");
					}
					System.out.print("\n");
				}

				int c[][]=new int[m][n];
				for(i=0; i<m; i++){
					for(j=0; j<n; j++){
						c[i][j]=a[i][j]+b[i][j];
					}
				}

				System.out.println();
				System.out.println("the matrixs addition C");
				for(i=0; i<m; i++){
					for(j=0; j<n;j++){
						System.out.print(c[i][j]+" ");
					}
					System.out.print("\n");
				}
				System.out.println();
				System.out.println("if want to continue enter yes otherwise no");
				con=scr.next();
				System.out.println();
			}
			catch(InputMismatchException e){
				System.out.println("enter valid number");
			}
		}
	}
}
