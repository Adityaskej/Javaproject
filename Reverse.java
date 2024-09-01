package test;

public class Reverse {

	public Reverse() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args) {
		 
		 String str= "My Name is Aditya", nstr="";
	        char ch;
		 
		 for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        //System.out.println("Reversed word: "+ ch);
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
		 
	 }

