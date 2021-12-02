import java.util.Scanner;
public class JambScore {
  public static void main(String[] args) {
	
	String name= "";
	int y = 0;
	int i= 0;

   System.out.print("\tThis programme is to determine whether you are eligible to gain admission into veritas university to "+
   "read computer science you will be evaluated based on your JAMb score and the Number of credits you have in WAEC");
   
   Scanner Input = new Scanner (System.in);
   
	System.out.print("Please Enter Your Name: ");
	    name = Input.nextLine();//accept name from user
	
		while(true){
	   System.out.print("Please enter your JAMBscore: ");
	    i = Input.nextInt();//accept user's jambscore

		if (i>=0 && i<=400)
		break;

		System.out.println("Dear "+name+" the score given is an invalid JAMBscore");			
		}

	while (true){
	   System.out.print("Please enter the number of credits you had in WAEC: " );
	    y = Input.nextInt();//accept user's WAEC credit number
	if ( y>=0 && y<=9)
	break;

	System.out.println("Dear "+name+" the credit number given is an invalid WAEC score");		
	}
	if (i<200 && y<5)
		System.out.println("Dear "+name+" you are not eligible to gain admission into veritas university"
		+" because your WAEC credit number and JAMB score does not meet our requirements");
	
	else if (i<200)  
		System.out.println("Dear "+name+" you are not eligible to gain admission into veritas university because "
		+"your Jamb score does not meet our requirements");
		
	else if (y<5)
		System.out.println("Dear "+name+" you are not eligible to gain admission into veritas university because "
		+"your WAEC credit number does not meet our requirements");
		
		 if (i>=200 && y>=5 )
	System.out.println("Dear "+name+" you are eligible to gain admission into veritas university");

	}
}
 