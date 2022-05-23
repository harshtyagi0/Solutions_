package q6;

import java.util.Scanner;

public class Main {

	static void convertOpposite(StringBuffer str) {
		int ln = str.length();
		for (int i = 0; i < ln; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				str.replace(i, i + 1, Character.toUpperCase(c) + "");
			else
				str.replace(i, i + 1, Character.toLowerCase(c) + "");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.next();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		convertOpposite(sb);
		System.out.println(sb);
	}

}
