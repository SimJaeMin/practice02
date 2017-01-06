package prob1;
import java.util.Scanner;
public class Prob1 {
	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int k=ss.nextInt();
		int temp=0;
		int temp1;
		temp1=k/50000;
		temp=k%50000;
		System.out.println("5만원권 :"+temp1);
		temp1=temp/10000;
		temp=temp%10000;
		System.out.println("1만원권 : "+temp1);
		temp1=temp/5000;
		temp=temp%5000;
		System.out.println("5천원권 :"+temp1);
		temp1=temp/1000;
		temp=temp%1000;
		System.out.println("1천원권 :"+ temp1);
		temp1=temp/500;
		temp=temp%500;
		System.out.println("5백원 : "+temp1);
		temp1=temp/100;
		temp=temp%100;
		System.out.println("1백원 :"+temp1);
		temp1=temp/50;
		temp=temp%50;
		System.out.println("50원 :"+ temp1);
		temp1=temp/10;
		temp=temp%10;
		System.out.println("10원 :"+temp1);
		temp1=temp/5;
		temp=temp%5;
		System.out.println("5원 : "+temp1);
		temp1=temp/1;
		temp=temp%1;
		System.out.println("1원 :"+temp1);
				
		
	}
}