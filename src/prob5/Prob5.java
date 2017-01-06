package prob5;
import java.util.Random;
import java.util.Scanner;
public class Prob5 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		Random random = new Random();
		int k =random.nextInt(100);
		int count=0;
		System.out.println("1부터 100까지 수중 하나를 맞혀보세요");
		int big=100;
		int small=0;
		boolean succes = true;
		for(;succes;){
			count++;
			System.out.println("숫자를 입력해주세요");
			int a=ss.nextInt();
			if(k>a){
				small=a;
				System.out.println("입력한 숫자보다 값이 크다."+a+" ~ "+big+"사이");
			}
			else if(k<a){
				big=a;
				System.out.println("입력한 숫자보다 작습니다."+ small+" ~ "+ big +"사이");
			}
			else{
				System.out.println("정답입니다."+count+" 번시도만에 맞혔습니다.");
				System.out.print("한번더 하실꺼면 y를 눌러주세요");
				if(ss.next().equals("y")){
					continue;
				}
				else
					succes=false;
			}
		}
		System.out.println("수고하셨습니다.");
	}
}