import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int noOfPeople = sc.nextInt();
        int fine = 0;
        String Action = "Warning";
        
        
        if(noOfPeople<=100){
            fine = 0;
            Action = " No Fine";
        }
        else if(noOfPeople<=200 && noOfPeople>=101){
            fine = (noOfPeople-100)*500;
            Action = " Warning";
        }
        else if(noOfPeople>200){
            fine = (noOfPeople-100)*1000;
            Action = " Register Case";
        }
        
        System.out.println(fine + Action);
	}
}
