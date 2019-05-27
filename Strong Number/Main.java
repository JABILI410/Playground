import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
       int n=in.nextInt();
        int y=n,sum=0,r,i,fac=1;
      while(n>0)
       {
          r=n%10;
         for(i=r;i>0;i--)
         {
            fac=fac*i;
         }
        n=n/10;
        sum=sum+fac;
        fac=1;
        
      }
        if(y==sum)
        {
          System.out.println("Yes");
        }
      else
      {
        System.out.println("No");
      }
	}
}