public class Main
{
	public static void main(String[] args) {
		String str = "hello bro";
		String s = "";
	    char ch = ' ';
	    
	    for(int i = 0;i<str.length();i++)
	    {
	        char c = str.charAt(i);
	        if(ch == ' ' && c != ' '){
	            c = Character.toUpperCase(str.charAt(i));
	            s = s+c;
	        }
	        else{
	            s = s+c;
	        }
	        ch = str.charAt(i);
	    }
	    System.out.println(s);
	}
}
