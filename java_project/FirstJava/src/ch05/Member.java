package ch05;

public class Member {

	private String name;
	private String phoneNumber;
	private String major;
	private int grade;
	private String email;
	private String birthday;
	private String address;
	
	Member(String name, String phoneNumber, String major, int grade, String email, String birthday, String address) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.major = major;
	this.grade = grade;
	this.email = email;
	this.birthday = birthday;
	this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Member(String name, 
			String phoneNumber, 
			String major, 
			int grade, 
			String email){
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.major = major;
//		this.grade = grade;
//		this.email = email;
		this(name, phoneNumber, major, grade, email, null, null);
	}

	
	void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("전공 : " + this.major);
		System.out.println("학년 : " + this.grade);
		System.out.println("이메일 : " + this.email);
		
		if(this.birthday == null) {
			System.out.println("생일 : 입력된 데이터가 없습니다.");
		} else {
			System.out.println("생일: "+ birthday);
		}
		
		if(this.address !=null) {
			System.out.println("주소 : " + address);
		} else {
			System.out.println("주소 : 입력된 데이터가 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Member member1 = new Member("가영", "010-1234-5678", "화공", 4, "gy@gmail.com", "0101", "서울");
		member1.showInfo();
		
		Member member2 = new Member("나영", "010-9876-5432", "생공", 3, "ny@naver.com");
		member2.showInfo();
		
	}
	
}
