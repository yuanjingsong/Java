
public class FindPrime {
	public static void main(String[] args){
		int i, j;	
		for(i = 100 ; i<200 ; i++ ){
			for(j =2 ; j <= Math.sqrt(i); j++){
				if( i % j == 0)
					break;
			}
			if(j > Math.sqrt(i))
				System.out.println(i);
		}
	}
}
