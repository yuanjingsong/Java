package homeWork;
import java.util.*;
public class RandomNum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random a = new Random();
		Scanner in = new Scanner (System.in);
		int Numbers = in.nextInt();
		System.out.println(a.getRandom(Numbers));
	}

}
class Random{
	int Num;
	public static int getRandom(int Numbers){			
			double Number = Math.random();
			int ReturnNum = (int)((Number * 53) + 1);
			if(ReturnNum ==Numbers){
				ReturnNum = getRandom(Numbers);
			}
			return ReturnNum;
	}
}