
public class FindNarcissistic_Number {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i = 100; i < 999; i++){
			if( Math.pow(i%10, 3) + Math.pow((i /10) % 10 , 3) + Math.pow(i/100, 3) == i ){
				System.out.println(i);
			}
		}
	}

}
