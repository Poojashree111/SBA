package SBA;
import java.util.*;

public class Least {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of items:");
        int n = s.nextInt(); s.nextLine();
        String input1[][] = new String[n][3];
        
        for(int i=0;i<n;i++){
          input1[i] = s.nextLine().split(",");
          }
          
          int discount[] = new int[n];
          for(int i=0;i<n;i++){
            discount[i] = (Integer.parseInt(input1[i][1])*Integer.parseInt(input1[i][2])/100);
          }
          
          int min=9999;
          for(int i=0;i<n;i++){
            if(min>discount[i])min=discount[i];
          }
          
          for(int i=0;i<n;i++){
            if(min==discount[i]) 
            	System.out.print(input1[i][0]+" ");
          }
        
	}

	}


