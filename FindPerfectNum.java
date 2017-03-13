
public class FindPerfectNum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			///to Find Perfect Numbers between 1 to 1000;
		
		for(int i =2 ; i < 1000; i++){
			int minus = i;
			for(int j = 1 ; j < i; j++){
				if( i % j == 0)
				{
					minus = minus -j;
				}
				if(minus == 0)
				{
					System.out.println(i);
					break;
				}
			}
		}
		for(int i =2 ; i< 1000; i++){
			int sum = 0;
			for( int j = 1 ; j< i; j++){
				if(i % j == 0){
					sum +=j;
				}
				if(sum == i){
					System.out.println(i);
					break;
				}
			}
		}
	}
}


