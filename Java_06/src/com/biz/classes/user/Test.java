package com.biz.classes.user;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 기존에 입력된 문자열에서 원하는 문자를 찾는 방법
		// 문자열의 길이만큼 반복문 String.length;
		// 찾고자 하는 문자열을 입력받음 Scanner;
		// 원하는 문자열이 없을 경우 없다고 표시
		//

		String str = "student";
		String strcA = "";
		int intlength = str.length();

		Scanner scan = new Scanner(System.in);
		String strSearch = "";
		System.out.printf("찾고자 하는 문자열을 입력하세요 : >>");
		strSearch = scan.nextLine();

		int index;
		for (index = 0; index < intlength; index++) {
			strcA = str.substring(index, index + 1);
			if (strcA.equalsIgnoreCase(strSearch)) {
				break;
			}
		}
		if (index < intlength) {
			System.out.println(strSearch + "는 " + index + "번째에 위치해 있습니다.");
		} else {
			System.out.println("찾고자하는 문자가 문자열에 없습니다.");
		}

	}

}
