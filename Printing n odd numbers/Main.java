import java.util.Scanner;
class Main
{
	public static void main (String[] args)
     {
	     Scanner in=new Scanner(System.in);
         int n=in.nextInt();
      int i;
          for(i=0;i<2*n;i++)
          {
            if(i%2==1)
            {
              System.out.println(i);
            }
          }
	}
}