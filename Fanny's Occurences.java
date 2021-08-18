import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    String str = sc.nextLine();
	    String word = sc.nextLine();
	    
	    char[] ch = str.toCharArray();
	    char[] w = word.toCharArray();
	    
	    String s = "";
	    
	    for(int i =0;i<str.length();i++){
	        if(ch[i] == w[0]){
	            continue;
	        }
	        else{
	            s = s + ch[i];
	        }
	    }
	    System.out.println(s);
	}
}
