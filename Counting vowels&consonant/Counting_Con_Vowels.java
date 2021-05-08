import java.util.*;
class Counting_Con_Vowels 
{
	static String word;
	static String repeat="yes";
	static int vowcount;
	static int concount;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(repeat.equals("yes")){
			vowcount=0;
			concount=0;
			System.out.println("Enter your word");
			word=sc.nextLine().toLowerCase();
			word=word.trim();
			System.out.println();

			if(word.isEmpty()){
				System.out.println("String is empty");
				System.out.println();
				continue;
			}
			else{
				word=word.replace(" ","");
				if(word.isEmpty()){
					System.out.println("String is empty");
					System.out.println();
					continue;
				}
				else{
					for(int i=0; i<word.length(); i++){
						if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
							vowcount++;
						}
						else if(Character.isLetter(word.charAt(i))){
							concount++;
						}

					}
					System.out.println("The no of vowels : "+vowcount);
					System.out.println("The no of consonants : "+concount);
					System.out.println();
					System.out.println("if you want continue type yes otherwise type no");
					repeat=sc.nextLine().toLowerCase();
				}
			}
		}

	}
}
