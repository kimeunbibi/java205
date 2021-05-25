package ch03;

import java.util.Scanner;

public class Member {

	static void Check1(int year) {
		
		int age = 2021-year+1;
		Scanner scanner = new Scanner(System.in);
		if (age < 15 || age >= 65 ) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}
	}
		
	static void Check2(int year) {
		
		int age = 2021-year+1;
		if (age >=20 && year % 2 == 1) {
			System.out.println("올해 무료 검사 대상입니다.");
		} else {
			System.out.println("올해 무료 검사 대상이 아닙니다.");
		}
		
		if  (age >= 40) {
			System.out.println("암 무료 검사가 가능합니다.");
		} else {
			System.out.println("암 무료 검사 대상이 아닙니다.");
		}
		
	}

	public static void main(String[] args) {

		while(true) {	
			Scanner scanner = new Scanner(System.in);
			System.out.println("태어난 해?");
			int year = scanner.nextInt();
			Check1(year);
			Check2(year);
	
		}

	}
}