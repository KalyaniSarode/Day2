import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner io = new Scanner (System.in);
          System.out.println("Input the radious of the circle:");
          double radious =io.nextDouble();
          System.out.println("perimiter is=" +(Math.PI *radious*radious));
          
	}

}
