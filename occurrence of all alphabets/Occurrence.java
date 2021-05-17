import java.util.*;
class  Occurrence
{
	public static void main(String[] args) 
	{
		int max,count,length;
		String con="yes";
		Scanner sc=new Scanner(System.in);
		while(con.equals("yes")){
			max=1;
			count=1;
			System.out.println("enter your here: ");
			String s=sc.nextLine();
			length=s.length();
			ArrayList li=new ArrayList();
			for(int i=0; i<length; i++){
				li.add(s.charAt(i));
			}
			System.out.println();
			System.out.println("Here is the occurences:");
			for(int i=0; i<li.size(); i++){
				for(int j=(i+1); j<li.size(); j++){
					if(li.get(i)==li.get(j)){
						count++;
						li.remove(j);
						j--;
					}
				}
				System.out.println(li.get(0)+"="+count);
				li.remove(i);
				i--;
				count=1;
			}
			System.out.println();
			System.out.println("if you want continue enter yes otherwise no");
			con=sc.nextLine().toLowerCase();
			System.out.println();
		}
	}
}
