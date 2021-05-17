import java.util.*;
class  Counting
{
	public static void main(String[] args) 
	{
		String con="yes";
		Scanner sc=new Scanner(System.in);
		while(con.equals("yes")){
			int letter=0,spl=0,dig=0,ws=0;
			System.out.println("enter your here: ");
			String s=sc.nextLine();
			System.out.println();
			for(int i=0; i<s.length(); i++){
				if(Character.isLetter(s.charAt(i))){
					letter++;
				}
				else if(Character.isDigit(s.charAt(i))){
					dig++;
				}
				else if(Character.isWhitespace(s.charAt(i))){
					ws++;
				}
				else if(Character.isLetter(s.charAt(i))==false){
					spl++;
				}
			}
			System.out.println();
			System.out.println("Here is the count: ");
			System.out.println("Letters: "+letter+"\ndigits: "+dig+"\nWhiteSpace: "+ws+"\nSpecialCharacters: "+spl);
			System.out.println();
			System.out.println("if you want continue enter yes otherwise no");
			con=sc.nextLine().toLowerCase();
			System.out.println();
		}
	}
}
