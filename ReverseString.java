package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String bee = "Welcome";
	String rev = "";
	char c[] = bee.toCharArray();
	int a = bee.length()-1;
	System.out.println(a);
	
	for(int i=a; i>=0;i--)
	{
		rev = rev+c[i];	
		
	}

	System.out.println(rev);
	
}
}