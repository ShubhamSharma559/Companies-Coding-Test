import java.util.Scanner;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int first = 1, second = 1;
	    int third = first + second;
	    if(n>3)
	    {
	        for(int i = n;i>3;i--){
	            int temp = third;
	            third = third+second;
	            second = temp;
	        }
	    }
	    if(n == 1)
	        third = first;
	    else if(n==2)
	        third = second;
	    else if(n==3)
	        third = third;
	    else{
	        System.out.println("Invalid index");
	        System.exit(0);
	    }
	        
		System.out.println(third);
	}
}
