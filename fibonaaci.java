/* Shubh Agarwal
22070126108
AIML B2 */

// fibonaaci.java 

import java.io.*;
import java.util.* ; 
public class fibonaaci{
	public static void main(String args[]){
		// command line arguments 
		/*
		Scanner sc=new Scanner(System.in);
		int number =  sc.nextInt();
		*/
		/*int number = Integer.parseInt(args[0]);
		*/
		// buffered reader is primarily used for file handling 
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		try{

			int number = Integer.parseInt(reader.readLine());

			int i ;
			for(i=0 ; i<number ; i++){
				System.out.println(fibonaccialgo(i)+ " ");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}	
	}
    // fibonacci series 
	public static int fibonaccialgo(int number){
    
		if(number<=1){
			return number ; 

		}
		else{
			return fibonacci(number-1) + fibonacci(number-2);
		}
	}
}