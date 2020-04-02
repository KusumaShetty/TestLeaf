package week1.day3;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "welcome to java pradeep";
		String txt1 = "kusuma";		
		// 1)length of the string
		
		System.out.println(txt.length());

		//2)Get a character using index in string
		
		System.out.println(txt.charAt(2));
		
		//3)Get a index of character in string
		
		System.out.println(txt.indexOf('c'));
		
		int p = txt.indexOf('e');
		System.out.println(p);
		
		//4)Last Index
		
		System.out.println(txt.lastIndexOf('e'));
		
		//5)Trim
		
		System.out.println(txt.trim());
		
		//6)concat
		
		String b = txt.concat(txt1);
		System.out.println(b);
		
		// 7)+
		
		System.out.println(txt+txt1);
		
		//8)Uppercase
		
		System.out.println(txt.toUpperCase());
		
		//9)Lowercase
		
		System.out.println(txt.toLowerCase());
		
		//10)covert all the string in to characterArray
		
		char a[] = txt.toCharArray();
		System.out.println(a[2]);
		
		//11)split
		
		String c[] = txt.split(" ");
		System.out.println(c[3]);
		
		//12)substring
		
		System.out.println(txt.substring(6));
		
		System.out.println(txt.substring(7,23));
		
		//13)compare two stings
		
        System.out.println(txt.equals(txt1));
        
        //14)starts with
        
        System.out.println(txt1.startsWith("kusuma"));
        
        //15)ends with
        
        System.out.println(txt.endsWith("pradee"));
        
        //16)replace with
        
        System.out.println(txt1.replace('k', 'K'));
		
		
	}	

}
