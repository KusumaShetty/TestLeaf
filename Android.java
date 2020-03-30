package week1.day1;

public class Android {
	
	//Variables Initiation & Declaration
	
char A = 'A';
boolean touchControl = true;
long androidDev = 2008; 
String verName = "Cupcake";
int storageSpace = 256;
float androidVer =1.5f;
double ipAddress= 100.706046;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling the variable & storing in the local variable
		
		Android cake = new Android();
		char B = cake.A;
		boolean touchControl2 = cake.touchControl;
		long androidDev2 = cake.androidDev;
		String verName2 = cake.verName;
		double ipAddress2 = cake.ipAddress;
		int storageSpace2 = cake.storageSpace;
		float androidVer2 = cake.androidVer;
		
		//printing the variables
		
		System.out.println(B);
		System.out.println(touchControl2);
		System.out.println(androidDev2);
		System.out.println(verName2);
		System.out.println(ipAddress2);
		System.out.println(storageSpace2);
		System.out.println(androidVer2);
		
	}

}
