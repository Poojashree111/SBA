package SBA;
import java.util.*;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Inmate's name:");
        String name=sc.nextLine();
        System.out.print("Inmate's father's name:");
        String fname=sc.nextLine();
       String s= name.concat(" ") .concat(fname); 
        char []chars=name.toCharArray();
        for(char c:chars)
        {
            if(Character.isDigit(c)||c=='+'||c=='!'||c=='@'||c=='#'||c=='%'||c=='$'||c=='^'||c=='&'||c=='*'||c=='('
            ||c==')'||c=='-'||c=='='||c=='/'||c=='<'||c=='>'||c=='?'||c=='{'||c=='}'||c=='['||c==']')
            {
                System.out.print("Invalid name");
                System.exit(0);
            }
        }
        System.out.println(s.toUpperCase());
   
	}

}
