import java.util.Scanner;
public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x,y,sum=0;
      Scanner s=new Scanner (System.in);
      System.out.println("Enter the number:");
      x=s.nextInt();
      while(x>0) {
    	  y=x%10;
    	  sum=sum+y;
    	  x=x/10;
    	  System.out.println("sum of digits:" +sum);
      }
	}

}
