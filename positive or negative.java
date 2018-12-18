
import java.util.Scanner;
class java
{
public static void main(String[] args)
{
  int a;
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  if(a>0)
    {
    System.out.println("positive");
    }
  else if(a<0)
    {
    System.out.println("negative");
    }
  else
    {
    System.out.println("zero");
    }
  }
}
