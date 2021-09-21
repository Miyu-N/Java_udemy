package info.searchman;

public class HelloWorld {
	public static void main(String args[]) {
		int sum = 0;
		int i; //iをforの外で定義する
		for (i = 1; i <= 10; i ++) {
		sum += i;
		if( sum > 30)break;
		}
		System.out.println("30を超えたのは？：" + i);
	}
}
