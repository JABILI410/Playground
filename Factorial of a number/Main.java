import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fac=1,i;
      for(i=n;i>0;i--)
      {
        fac=fac*i;
      }
      System.out.println(fac);
                       
	}
}