import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args)
	{
         
		Scanner snr =new Scanner(System.in);
		if(snr.hasNext()){
		    int numberOfTest=snr.nextInt();
		    for(int t=0;t<numberOfTest;t++){
		        printPattern(snr.nextInt());
		    }
		}
	}
	private static void printPattern(int N){
	    for(int i=0;i<2*N-1;i++){
	        for(int j=0;j<2*N-1;j++){
	            System.out.print(1+Math.max(Math.abs(N-i-1),Math.abs(N-j-1)));
	        }
	          System.out.println();
	    }
	  
		 
	}
	
	
}
