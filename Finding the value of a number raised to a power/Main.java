import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int res=1,count=0;
      while(count<e)
      {
        res=res*b;
        count++;
      }
      System.out.print(res);
    }
}







