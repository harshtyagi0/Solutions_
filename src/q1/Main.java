package q1;

import java.util.Scanner;

public class Main {

	public static Integer SplitTheNumber(String p) {
//		splitting on the basis of space
		String[] words = p.split(" ");
		Integer result = 0;
//		checking + sign is contained by words[1] or not 
		if (words[1].contains("+")) {
			
			String[] splittedOnBases = words[1].split("\\+"); //splitting words[1] on the basis of + sign
//			on the basis splittedOnBases[0]'s length words[0].substing() indexes is calculated
			result = Integer.parseInt(words[0].substring(0, splittedOnBases[0].length()))
					+ Integer.parseInt(words[0].substring(splittedOnBases[0].length()));
			return result;
		}
//		checking - sign is contained by words[1] or not 
		if (words[1].contains("-")) {
			String[] splittedOnBases = words[1].split("-");//splitting words[1] on the basis of - sign
//			on the basis splittedOnBases[0]'s length words[0].substing() indexes is calculated
			result = Integer.parseInt(words[0].substring(0, splittedOnBases[0].length()))
					- Integer.parseInt(words[0].substring(splittedOnBases[0].length()));
			return result;

		}
//		if + and - both sign are not there then -1 is returned
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the data : ");
		String pattern = scan.nextLine();
		
		System.out.println("Output is : "+SplitTheNumber(pattern));

	}

}
