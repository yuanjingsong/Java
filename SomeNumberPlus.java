import java.util.*;
public class SomeNumberPlus {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); /// choose the number to add
		int b = in.nextInt(); /// choose the times
		int temp = 0;
		int sum = 0;
		for(int i = 0; i < b; i++){
			temp = a   + temp * 10 ; 
			sum +=temp;
		}
		if(sum ==  (4444+ 444 + 44+ 4))
		System.out.println(sum);
	}

}
