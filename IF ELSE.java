/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Scanner;//import scanner function
public class Function
{
	public static void main(String args[])
	{       Scanner myscanner =new Scanner(System.in);
            print("Enter Your Marks:  ");
            int marks=myscanner.nextInt();
            if(marks>80)
            {
                print("you got A+");
            }
            else if(marks>70)
            {
                print("you got A");
            }
            else if(marks>60)
                    {
                        print(you got B);
                    }
            else if(marks<33)
            {
                print("fail");
            }
       
        }
        
        public static void print(String msg)
        {
            System.out.println(msg);
        }
               
        }
		
	



 

