import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,count=0;
      double a,sum=0;
      int z=n,y=n;
      while(n>0)
      {
        n=n/10;
        count++;
      }
      for(i=1;i<=count;i++)
      {
        a=y%10;
        sum=sum+Math.pow(a,count);
        y=y/10;
      }
      if(sum==z)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        
	}
}