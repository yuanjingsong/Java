import java.util.*;
public class FindGCDandLCm {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("Input 2 numbers");
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		//Find GCD
		if( a < b ){
		int temp = b;
		b = a ;
		a = temp;
		}
		// make sure a > b 
		while ( a % b != 0  ){
			int temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println(b);
		
		
		//Find LCM
		System.out.println("Input 2 numbers");
		int a1 = in.nextInt();
		int b1 = in.nextInt();
	
		int copyA = a1;
		int copyB = b1;		
		if( a1 < b1 ){
		int temp = b1;
		b1 = a1 ;
		a1 = temp;
		}
		// ma1ke sure a > b1 
		while ( a1 % b1 != 0  ){
			int temp = a1 % b1;
			a1 = b1;
			b1 = temp;
		}
		//LCM = a1*b1 /b1
		int LCM = copyA * copyB / b1;
		System.out.println(LCM);
	}

}
