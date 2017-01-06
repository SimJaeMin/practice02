package prob4;

import java.util.Scanner;
public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] c = reverse( s );
		printCharArray( c );
		scanner.close();
	}
	
	public static char[] reverse(String str) {
		char c[]=str.toCharArray();
		char temp;
		for(int j=0;j<c.length;j++){
		for(int i=0;i<(c.length-1);i++){
			temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
		}
		}
		return c;
	}

	public static void printCharArray(char[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}
