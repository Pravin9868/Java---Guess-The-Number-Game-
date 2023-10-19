package pkg;

import java.util.Random;
import java.util.Scanner;

public class Snippet {
	
	int numb;
//	int guessTimes;
	int inputNum;

//	this Code defines the Random Number Generated and Guess That Number . 
	public Snippet() {
		// TODO Auto-generated constructor stub
        Random rn=new Random();
        
		this.numb=rn.nextInt(100);
         
	}
	public void userInputForGuess(){
	  Scanner sc= new Scanner(System.in);
      System.out.println("Guess  the  number :-");
	  inputNum=sc.nextInt();
      
	}	
	 public boolean isFind() {
		
		 if( inputNum== numb) {
			 return true;
		 }
		 else if(inputNum>numb) {
			 System.out.println("too high... ");
		 }
		 else if(inputNum<numb) {
			 System.out.println("too low... ");	 
		 }
		 
	 return false;
	 }
  
//	public int getGuessTimes() {
//			return guessTimes;
//		}
//	public void setGuessTimes(int guessTimes) {
//			this.guessTimes = guessTimes;
//		}	
	
	public static void main(String[] args) {
	       
		Snippet sn=new Snippet();
		System.out.println("Enter the Number try you want:- ");
		Scanner sc=new Scanner(System.in);
 	    int n=sc.nextInt(); //It restrict the number of Guesses 
 	    //it is also like a Challenge that HOW many Moves you want  
	for(int i=0;i<n;i++) {
		sn.userInputForGuess();
		boolean bl = sn.isFind();
		System.out.println(bl);
		}
	
	}	
	

}
