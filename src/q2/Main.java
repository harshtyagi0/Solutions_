package q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static int Number(String s) {
		int digit = 0;
		List<String> list = Arrays.asList(s.split(","));
		ArrayList<Integer> al = new ArrayList();
		for (String str : list)
			al.add(Integer.parseInt(str));
		Collections.sort(al);
		int sumOfPositiveNum = 0;
		int sumOfNegativeNum = 0;
		for (Integer i : al) {
			if (i > 0)
				sumOfPositiveNum += i;
			else
				sumOfNegativeNum += i;
			if (i == 0)
				digit++;
		}

		if (sumOfNegativeNum * (-1) < sumOfPositiveNum) {
			int val = sumOfPositiveNum + sumOfNegativeNum;
			for (Integer i : al) {
				if (i.intValue() > 0) {

					if (val > 0) {
						val -= i;
						digit++;

					} else {
						break;
					}
				}
			}
		} else if (sumOfNegativeNum * (-1) > sumOfPositiveNum) {
			int val = sumOfPositiveNum + sumOfNegativeNum;
			for (Integer i : al) {
				if (i.intValue() < 0) {

					if (val < 0) {
						val += i;
						digit++;

					} else {
						break;
					}
				}
			}
		} else {
			digit = 0;
		}
		return digit;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\harsh\\Desktop\\Document.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			System.out.println(Number(line));
		}

	}
}
