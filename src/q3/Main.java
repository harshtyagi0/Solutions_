package q3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private static final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
			"Seventy", "Eighty", "Ninety" };

	private static final String[] num = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeen", "Eighteen", "Nineteen" };

	private static String convertSmallerThanThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = num[number % 100];
			number /= 100;
		} else {
			soFar = num[number % 10];
			number /= 10;

			soFar = tens[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return num[number] + "Hundred" + soFar;
	}

	public static String convert(long number) {
		if (number == 0) {
			return "zero";
		}

		String snumber = Long.toString(number);

		
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		
		int billions = Integer.parseInt(snumber.substring(0, 3));
	
		int millions = Integer.parseInt(snumber.substring(3, 6));
	
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
	
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertSmallerThanThousand(billions) + "Billion";
			break;
		default:
			tradBillions = convertSmallerThanThousand(billions) + "Billion";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertSmallerThanThousand(millions) + "Million";
			break;
		default:
			tradMillions = convertSmallerThanThousand(millions) + "Million";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "oneThousand";
			break;
		default:
			tradHundredThousands = convertSmallerThanThousand(hundredThousands) + "Thousand";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertSmallerThanThousand(thousands);
		result = result + tradThousand;
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number/ Amount : ");
		String result = convert(scan.nextLong()) + "Dollar";
		System.out.println(result);

	}

}