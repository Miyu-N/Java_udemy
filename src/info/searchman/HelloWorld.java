package info.searchman;

public class HelloWorld {
	public static void main(String args[]) {
		String name[] = new String[3];
		double height[] = new double[3];
		name[0] = "ŽR“c";
		name[1] = "“c’†";
		name[2] = "—é–Ø";
		height[0] = 170.2;
		height[1] = 183.2;
		height[2] = 175.7;
		for (int i = 0; i <= 2; i++) {
			System.out.println(name[i] + ":" + height[i] + "cm");
		}
	}
}