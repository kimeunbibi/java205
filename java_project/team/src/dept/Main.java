package dept;

public class Main {

	public static void main(String[] args) {
		ProductManager p = new ProductManager(ProductDAO.getInstance());
		
		p.list();
	}

}
