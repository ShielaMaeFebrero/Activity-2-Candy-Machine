package candymachine.java;

import java.util.Scanner;

public class CandyMachine {

  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        
    // Display the menu
    System.out.println("1\t Candies");
    System.out.println("2\t Gum");
    System.out.println("3\t Chips");
    System.out.println("4\t Cookies");
    
       System.out.println("-------------------------- "); 
        
    System.out.println("Please enter the number of your choice:");
        System.out.println("-------------------------- ");
   
       int choice=sc.nextInt();
        System.out.println("-------------------------- ");
       switch (choice) {
              
           case 1: System.out.println("Candies cost 2php"); 
	               break;
      
           case 2: System.out.println("Gum cost 4php");
                   break;
        
           case 3: System.out.println("Chips cost 5php"); 
                   break;
       
           case 4: System.out.println("Cookies cost 8php");
                 break;
       
           default: System.out.println("Invalid choice");
        System.out.println("-------------------------- ");
      }
        System.out.println("-------------------------- ");
   
     System.out.println("Please Choose the cost amount "); 
        System.out.println("-------------------------- ");
     Scanner k = new Scanner(System.in);
        System.out.println("1\t 5php");
        System.out.println("2\t 4php");
        System.out.println("3\t 8hp");
        System.out.println("4\t 2php");
        System.out.println("-------------------------- ");
          int Purchase=k.nextInt();
        System.out.println("-------------------------- ");
         switch (Purchase) {
           
            case 1: System.out.println("Thank you Ma'am/Sir for Purchasing"); 
	                break;
	                
            case 2: System.out.println("Thank you Ma'am/Sir for Purchasing");
                    break;
                    
            case 3: System.out.println("Thank you Ma'am/Sir for Purchasing");
                    break;
                    
            case 4: System.out.println("Thank you Ma'am/Sir for Purchasing");
                    break;
                    
            default: System.out.println("Invalid choice");
  
  }
     }
  
  }
