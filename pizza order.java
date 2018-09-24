import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
      int ch;
      System.out.println("enter 0 for sunday")
        System.out.println("enter 1 for monday")
        System.out.println("enter 2 for tuesday")
        System.out.println("enter 3 for wedday")
        System.out.println("enter 4 for thurday")
        System.out.println("enter 5 for friday")
        System.out.println("enter 6 for satday")
        System.out.println("enter ur choice")
        Scanner s = new scanner(system.in);
      ch=s.nextInt();
      switch(ch)
      {
        case 0:
          System.out.println("free personal piza on purchase of medium pizza");
            break;
           case 1:
          System.out.println("Rs.101 OFF on a bill of Rs.400 and above");
            break;
           case 2:
          System.out.println("Free Plain Garlic Bread on another medium pizza");
            break;
           case 3:
          System.out.println("Buy 1 Get 1 Free on any medium pizza");
            break;
           case 4:
          System.out.println("Buy any medium pizza and get 50% off on another medium pizza");
            break;
           case 5:
          System.out.println("Tastiest pizza 20% off on bill of Rs.399 or above");
            break;
           case 6:
          System.out.println("Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350");
            break;
        default:
          System.out.println("enter the correct choice");

     
        
	}
}
