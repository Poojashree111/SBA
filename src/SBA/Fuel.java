package SBA;
import java.util.*;
import java.text.*;

public class Fuel {

	public static void main(String[] args) {
		
		      DecimalFormat df =new DecimalFormat("0.00");
		      Scanner sc= new Scanner (System.in);

		      System.out.println("Enter the no of liters to fill the tank");
		      float ltt =sc.nextInt();
		      

		      if(ltt<1){
		          System.out.println(ltt+" is an Invalid Input");
		          System.exit(0);
		      }
		      System.out.println("Enter the distance covered");
		      float diss =sc.nextInt();
		      
		      if(diss<1){
		          System.out.println(diss+" is an Invalid Input");
		          System.exit(0);
		      }
		      
		      System.out.println("liters/100km");
		      System.out.println(String.format("%.2f",(ltt/diss)*100));
		      System.out.println("miles/galoon");
		      System.out.println( String.format("%.2f",(diss*0.6214/(ltt*0.2642))));
		   
		
	}

}
