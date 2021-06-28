package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class ProductManager {
   ProductDao dao;
   Scanner sc;
   ArrayList<Order> arr;
   ArrayList<Product> pro;
   String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
   String user = "hr";
   String pw = "tiger";
   
   ProductManager() {
      sc = new Scanner(System.in);
      dao = new ProductDao();
      arr = new ArrayList<Order>();
      pro = new ArrayList<Product>();
   }
   
   public void productList() {
      Connection conn = null;

      try {
         conn = DriverManager.getConnection(jdbcUrl, user, pw);

         pro = dao.getProductList(conn);

         System.out.println("■■■■■■■■■■■■■ MENU ■■■■■■■■■■■■■");
         System.out.println("--------------------------------");
         System.out.println("상품번호 \t 상품이름 \t\t 상품가격 \t 상품 갯수");
         System.out.println("--------------------------------");


         for (Product p : pro) {
            System.out.printf("%d \t %s \t %d \t %d \n", p.getIcode(), p.getIname(),  p.getIprice(), p.getCount());
         }

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   void productInsert() {
      Connection conn = null;

      try {
         conn = DriverManager.getConnection(jdbcUrl, user, pw);
         
         while(true) {
            Product p = new Product();
            while(true) {
               System.out.println("아이스크림 메뉴번호를 입력해주세요.");
               int icode = sc.nextInt();
               int cnt = 0;
               for (int i = 0; i < pro.size(); i++) {
                  if(icode == pro.get(i).getIcode()) {
                     cnt++;
                     System.out.println("메뉴번호가 중복입니다. 다시입력하세요.");
                     break;
                  }
               }
               if(cnt != 1) {
                  p.setIcode(icode);
                  break;
               }
            }
            System.out.println("아이스크림 상품명을 입력해주세요. ");
            p.setIname(sc.next());
            System.out.println("아이스크림 가격을 입력해주세요.");
            p.setIprice(sc.nextInt());
            System.out.println("아이스크림 수량을 입력해주세요.");
            p.setCount(sc.nextInt());
            
            
            System.out.println("입력하시겠습니까?[y],[n]");
            String input = sc.next();
            if(input.equalsIgnoreCase("y")) {
               pro.add(p);
               int result = dao.insertProduct(conn, p);
               System.out.println("입력되셨습니다.");
               break;
            } else if(input.equalsIgnoreCase("n")) {
               System.out.println("다시입력해주세요.");
            } else {
               System.out.println("잘못입력하셨습니다. 초기화면으로 이동합니다.");
               break;
            }

         }
         

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   void productUpdate() {
	      Connection conn = null;

	      try {
	         conn = DriverManager.getConnection(jdbcUrl, user, pw);

	         while(true) {
	            
	            System.out.println("수정할 아이스크림 정보를 입력해주세요.");
	            System.out.println("상품번호, 상품이름, 상품가격, 상품 갯수 순으로 입력해주세요.");           
	           
	            String editData = sc.nextLine();
	            
	            String[] eData = editData.split(" ");
	            Product p;
	            if(eData.length == 4) {
	            	p = new Product(Integer.parseInt(eData[0]), eData[1], Integer.parseInt(eData[2]), Integer.parseInt(eData[3]));
	            	int result = dao.updateProduct(conn, p);
	            	System.out.println("■■■■■■■■■■ 해당 상품 정보가 변경 되었습니다. ■■■■■■■■■■");
	            	return;
	            } else {
	            	System.out.println("■■■■■■■■■■ 입력 형식을 올바르게 입력해주세요. ■■■■■■■■■■");
	            	continue;
	            }
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
   
   
// 버림
   /*
   void productUpdate() {
	      Connection conn = null;
	      try {
	         conn = DriverManager.getConnection(jdbcUrl, user, pw);
	         while(true) {
	            Product p = new Product();
	            
	            System.out.println("아이스크림 메뉴번호를 입력해주세요.");
	            int icode = sc.nextInt();
	            int result = dao.deleteProduct(conn, icode);
	            
	            if(result > 0) {
	               System.out.println("입력되었습니다.");
	            } else {
	               System.out.println("입력 실패!!!!");
	            }
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	   }
   
    
   public void allMenu() {
      while(true) {
         System.out.println("[1]전체메뉴 [2]메뉴추가 [3]메뉴삭제 [4]메뉴수정 [0]돌아가기");
         int input = sc.nextInt();
         switch(input) {
         case 1:
            productList();
            break;
         case 2:
            productInsert();
            break;
         case 3:
            // del메뉴추가 넣기
            break;
         case 4:
            // 메뉴수정
            break;
         }
      }
   }
   */
}