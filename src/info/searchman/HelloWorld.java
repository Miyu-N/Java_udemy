package info.searchman;

public class HelloWorld {
	public static void main(String args[]) {
		int umare;
		umare = 1980;
		if (umare < 1912) {
			System.out.println("明治生まれです");
		} else if (umare < 1927) {
			System.out.println("大正生まれです");
		} else if (umare < 1989) {
			System.out.println("昭和生まれです");
		} else {
			System.out.println("平成生まれです");
		}
	}
}
