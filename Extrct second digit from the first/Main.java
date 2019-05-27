import java.util.*;
class Main
{
  public static void main(String argd[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=n,a,counter=0;
    while(n>0)
    {
      n=n/10;
      counter++;
    }
    while(m>0)
    {
      a=m%10;
      m=m/10;
      counter--;
      if(counter==1)
      {
        System.out.print(a);
      }
    }
      
    
  }
}