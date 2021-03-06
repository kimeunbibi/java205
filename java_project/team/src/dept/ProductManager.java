package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

	private ProductDAO dao;
	private Scanner sc;
	public ProductManager(ProductDAO dao) {
		this.dao = dao;
		sc = new Scanner(System.in);
	}
	
	String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pw = "tiger";
	

	// 전체 리스트 출력 메소드
	// DAO 에서 데이터 리스트를 받고 출력 처리
	void list() {
		// Connection 객체 생성 -> 트렌젝션 처리
		Connection conn = null;

		// 2. 연결

		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);

			List<Product> list = dao.getProductList(conn);

			System.out.println("-----------메뉴입니다-----------");
			System.out.println("-----------------------------");
			System.out.println("상품번호 \t 상품이름 \t 상품가격");
			System.out.println("-----------------------------");
			
			for (Product pro : list) {
				System.out.printf("%d \t %s \t %s \n", pro.getIcode(), pro.getIname(), pro.getIprice());
			}

			System.out.println("-----------------------------");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("데이터베이스 연결 성공");
	}
}
