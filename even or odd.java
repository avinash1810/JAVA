import java.util.Scanner;

class guvi
{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else if(num % 2 != 0)
            System.out.println("Odd");
        else 
        	System.out.println("Invalid");
    }
}
