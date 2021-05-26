package ch06;

public class StudentM {

	public static void main(String[] args) {
		// 3.main()메소드에 아래 내용을 정의해봅시다.
		// ①Student 타입의 배열을 선언하고, 
		//  요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] students = new Student[10];


		// ②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		students[0] = new Student("김민지", 90, 85, 75);
		students[1] = new Student("이민지", 70, 100, 75);
		students[2] = new Student("박민지", 50, 60, 85);
		students[3] = new Student("최민지", 100, 85, 100);
		students[4] = new Student("신민지", 90, 85, 55);
		students[5] = new Student("한민지", 65, 40, 50);
		students[6] = new Student("서민지", 90, 85, 95);
		students[7] = new Student("임민지", 95, 85, 100);
		students[8] = new Student("조민지", 90, 80, 75);
		students[9] = new Student("장민지", 60, 40, 35);


		// ③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		System.out.println("이름 \t\t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println("=========================================================");
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i].getName());
			System.out.print("\t\t");
			System.out.print(students[i].getKor());
			System.out.print("\t");
			System.out.print(students[i].getEng());
			System.out.print("\t");
			System.out.print(students[i].getMath());
			System.out.print("\t");
			System.out.print(students[i].getSum());
			System.out.print("\t");
			System.out.println(students[i].getAvg());

		}


	}

}