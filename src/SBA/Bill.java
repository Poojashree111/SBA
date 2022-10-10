package SBA;
import java.util.*;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the no of pizzas bought:");
		        int piz=sc.nextInt();
		        System.out.println("Enter the no of puffs bought:");
		        int puf=sc.nextInt();
		        System.out.println("Enter the no of cool drinks bought:");
		        int cdk=sc.nextInt();
		       
		        System.out.println("Bill Details");
		        System.out.println("No of pizzas:"+piz);
		        System.out.println("No of puffs:"+puf);
		        System.out.println("No of cooldrinks:"+cdk);
		        System.out.println("Total price="+(piz*100+puf*20+cdk*10));
		       
		   
	}

}
