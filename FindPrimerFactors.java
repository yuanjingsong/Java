import java.util.*;
public class FindPrimerFactors {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner (System.in);
		int Num = in.nextInt();
		int i =2;
		while(i <= Num){
			if(Num % i== 0){
				Num = Num / i;
				System.out.println(i);
		}
			else
				i++;
		}
	}
}