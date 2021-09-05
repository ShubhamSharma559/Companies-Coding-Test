import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int first = 1, second = 1;   // to  start the factorial from zero, set first = 0
	    int third = first + second;
	    for(int i = n;i>3;i--){
	        int temp = third;
	        third = third+second;
	        second = temp;
	    }
		System.out.println(third);
	}
}
