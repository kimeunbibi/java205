package dept;

import java.beans.Statement;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDao {
	
	// 싱글톤 패턴 : 여러개의 인스턴스를 생성하지 못하도록 하는 디자인 패턴
	// 1. 외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리
	private DeptDao() {
	}
	
	// 2. 클래스 내부에서 인스턴스를 만들고
	static private DeptDao dao = new DeptDao();
	
	// 3. 메소드를 통해서 반환하도록 처리
	public static DeptDao getInstance() {
		return dao;
	}

	// 1. 전체 데이터 검색 기능
	// 반환 타입 List<Dept>
	// 매개변수 - Connection 객체 : Statement
	ArrayList<Dept> getDeptList(Connection conn) {
		
		ArrayList<Dept> list = null;
		
		// 데이터베이스의 Dept 테이블 이용 select 결과를 -> list 저장
		Statement stmt = null;
		ResultSet rSet = null;
		
	}
}


데이터베이스 연결 url의 예
Connection connection = DrvierManeger.getConnection
"jdbc:oracle:thin:@localhost:1521:xe"
"jdbc:oracle:thin:@localhost:1521:xe"

SQLException
//연결

String jdbcUrl = "jdbc:oracle:thin@localhost:1521:xe";
String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";

getConnection(String url) 

conn = DriverManager.getConnection(jdbcUrl, user, PasswordAuthentication);
System.out.println("데이터베이스 연결 성공!");

연결 

try {
	conn = Drivermanager;
	conn =getConnection
			
			getConnection 
}

getConnection DriverManger;
DriverConnection = Str

catch(Class)

System.out.println("Datan");

listener does not currenty catch (paly)

e.println()

String jbdv = 