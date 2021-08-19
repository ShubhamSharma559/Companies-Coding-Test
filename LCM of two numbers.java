import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int lcm = 0;
		
	    if(n1>n2)
	        lcm = n1;
	    else
	        lcm = n2;
	    
	    boolean j = true;
	    
	    while(j = true){
	        if(lcm%n1==0 && lcm%n2==0){
	            
	            j = false;
	            break;
	        }
	       lcm++;
	    }
	    System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
	}
}
