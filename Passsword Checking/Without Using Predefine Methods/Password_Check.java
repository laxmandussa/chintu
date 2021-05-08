import java.util.*;

class Password_Check 
{
	static String s;
	static int lower;
	static int upper;
	static int digit;
	static int spl;


	public static void main(String[] args){
		m1();
	}


	static void m1(){
		lower=0;
		upper=0;
		digit=0;
		spl=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Atleaste 8 characters");
		System.out.println("Atleaste one Uppercase");
		System.out.println("Atleaste one Lowercase");
		System.out.println("Atleaste one Number");
		System.out.println("Atleaste one Special Character");
		System.out.println("Enter Password By Following Above instructions");
		s=sc.nextLine();
		System.out.println();
		s=s.trim();
		if(s.length()==0){
			System.out.println("password doesn't conatin empty");
			System.out.println();
			m1();
		}
		else if(s.length()<=7){
			System.out.println("pls enter minimum 8 characters");
			System.out.println();
			System.out.println();
			m1();
		}
		else{
			m2();
		}
	}
	static void m2(){
		//[ \"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]
		char[] ch={'!','@','#','$','%','^','&','*','(',')','!','-','+','/','\\','[',']','{','}',
					'<','>',':','\'','"','`',':',';','=','_',',','.','?','~','|'};
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==' '){
				System.out.println("Pls password doesn't conatins any space");
				System.out.println();
				m1();
			}
			else{
				for(char c='A'; c<='Z'; c++){
					if(s.charAt(i)==c){
						upper++;
						break;
					}
				}  
				for(char c='a'; c<='z'; c++){
					if(s.charAt(i)==c){
						lower++;
						break;
					}
				}            
				for(char c='0'; c<='9'; c++){
					if(s.charAt(i)==c){
						digit++;
						break;
					}
				}            
				for(int c=0; c<ch.length; c++){
					if(s.charAt(i)==ch[c]){
						spl++;
						break;
					}
				}
			}
		}
		if(lower>=1&&upper>=1&&digit>=1&&spl>=1){
			if(s.length()>7&&s.length()<=12){
				System.out.println("Tq! Your password is Normal");
				System.out.println();
			}
			else if(s.length()>12&&s.length()<=15){
				System.out.println("Tq! Your password is Medium");
				System.out.println();
			}
			else if(s.length()>15){
				System.out.println("Tq! Your password is Strong");
				System.out.println();
			}
		}
		else{
			if(lower==0&&upper==0&&spl==0){
				System.out.println("Pls Enter atleaste one lower Letter, one upper Letter and one special character");
				System.out.println();
				m1();
			}
			else if(lower==0&&digit==0&&spl==0){
				System.out.println("Pls Enter atleaste one lower Letter, one digit and one special character");
				System.out.println();
				m1();
			}
			else if(upper==0&&digit==0&&spl==0){
				System.out.println("Pls Enter atleaste one digit, one upper Letter and one special character");
				System.out.println();
				m1();
			}
			else if(upper==0&&digit==0&&lower==0){
				System.out.println("Pls Enter atleaste one digit Letter, one upper Letter and one lower letter");
				System.out.println();
				m1();
			}
			else if(lower==0&&upper==0){
				System.out.println("Pls Enter atleaste one lower Letter and one Upper Letter");
				System.out.println();
				m1();
			}
			else if(lower==0&&digit==0){
				System.out.println("Pls Enter atleaste one lower Letter and one one digit");
				System.out.println();
				m1();
			}
			else if(lower==0&&spl==0){
				System.out.println("Pls Enter atleaste one lower Letter and one special character");
				System.out.println();
				m1();
			}
			else if(upper==0&&digit==0){
				System.out.println("Pls Enter atleaste one upper Letter and one digit");
				System.out.println();
				m1();
			}
			else if(upper==0&&spl==0){
				System.out.println("Pls Enter atleaste one upper Letter and one special character");
				System.out.println();
				m1();
			}
			else if(digit==0&&spl==0){
				System.out.println("Pls Enter atleaste one digit and one special character");
				System.out.println();
				m1();
			}
			else if(lower==0){
				System.out.println("Pls Enter atleaste one lower Letter");
				System.out.println();
				m1();
			}
			else if(upper==0){
				System.out.println("Pls Enter atleaste one Upper Letter");
				System.out.println();
				m1();
			}
			else if(digit==0){
				System.out.println("Pls Enter atleaste one digit");
				System.out.println();
				m1();
			}
			else if(spl==0){
				System.out.println("Pls Enter atleaste one special character");
				System.out.println();
				m1();
			}
		}
	}
}
