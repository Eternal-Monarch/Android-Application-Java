import java.util.Scanner;
public class Main
{ 
	public static void main(String[] args) 
	{   
	    Scanner input=new Scanner(System.in);
	    int num1;
	    System.out.println("enter the number");
	    num1=input.nextInt();
	     
   
    switch(num1)
    {
        case 0:
        System.out.println("Zero");
        case 1:
        System.out.println("one");
        break;
        case 2:
        System.out.println("two");
        break;
        case 3:
        System.out.println("three");
        break;
        default:
        System.out.println("not found");
        
    }
    
		
	}
}
