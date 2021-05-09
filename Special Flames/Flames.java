import java.util.*;
public class Flames
{	
	static int spl;
	static String s1;
	static String s2;
    public static void main(String[] args)
	{

	 Scanner sc=new Scanner(System.in);
	 while(true){
		System.out.print("First Name: ");
		s1=sc.nextLine().toLowerCase();
		System.out.println();
		s1=s1.trim();
		s1=s1.replace(" ","");
		if(s1.isEmpty()){
			System.out.println("first name doesn't conatin empty");
			System.out.println();
			continue;
		}
		for(int i=0; i<s1.length(); i++){
			if(Character.isLetter(s1.charAt(i))==false){
				spl++;
				break;
			}
		}
		if(spl==1){
			spl=0;
			System.out.println("first name doesn't conatin any digit or special character");
			System.out.println();
			continue;
		}
		break;
	 }
	 while(true){
		System.out.print("Second Name: ");
		s2=sc.nextLine().toLowerCase();
		System.out.println();
		s2=s2.trim();
		s2=s2.replace(" ","");
		if(s2.isEmpty()){
			System.out.println("second name doesn't conatin empty");
			System.out.println();
			continue;
		}
		for(int i=0; i<s2.length(); i++){
			if(Character.isLetter(s2.charAt(i))==false){
				spl++;
				break;
			}
		}
		if(spl==1){
			spl=0;
			System.out.println("second name doesn't any digit or special character");
			System.out.println();
			continue;
		}
		break;
	 }
	 StringBuffer str1=new StringBuffer(s1);
	 StringBuffer str2=new StringBuffer(s2);
	 for(int i=0; i<str1.length(); i++){
		 for(int j=0; j<str2.length(); j++){
			 if(str1.charAt(i)==str2.charAt(j)){
				 str1.deleteCharAt(i);
				 str2.deleteCharAt(j);
				 break;
			 }
		 }
	 }
	 int count=str1.length()+str2.length();
	 System.out.println("count="+count);
	 System.out.println();
     String s="Flames";
     StringBuffer str=new StringBuffer(s);
	 int length=str.length();			
	 int j=0;
	 while(length!=1){
			for(int i=1; i<=count; i++){
				if(j==length){
					j=0;
				}
				j++;
			}
			str.deleteCharAt(j-1);
			j--;
			length--;
	 }
	 char a=str.charAt(0);
	 switch(a){
		 case 'f':
			 System.out.println("FRIENDS");
			 break;
		 case 'l':
			 System.out.println("LOVER");
			 break;
		 case 'a':
			 System.out.println("AFFECTION");
			 break;
		 case 'm':
			 System.out.println("MARIAGE");
			 break;
		 case 'e':
			 System.out.println("ENEMY");
			 break;
		 case 's':
			 System.out.println("SISTER");
	 } 
			System.out.println();
	}
}
