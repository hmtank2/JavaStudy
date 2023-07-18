package book;

public class BookTest {
	public static void main(String[] args) {
		Book sqlBook = new Book("SQL Plus",50000,5.0);
		Book java2 = new Book("Java 2.0",40000,3.0);
		Book jspServlet = new Book("SQL Plus",60000,6.0);
		
		System.out.println("책 이름"+"\t"+"가격"+"\t"+"할인율"+"\t"+"할인 후 금액");
		
		System.out.println(sqlBook.getBookName()+sqlBook.getBookPrice()+"\t"+sqlBook.getBookDiscountRate()+"\t"+sqlBook.getDiscountBookPrice());
		System.out.println(java2.getBookName()+java2.getBookPrice()+"\t"+java2.getBookDiscountRate()+"\t"+java2.getDiscountBookPrice());
		System.out.println(jspServlet.getBookName()+jspServlet.getBookPrice()+"\t"+jspServlet.getBookDiscountRate()+"\t"+jspServlet.getDiscountBookPrice());
		
		
		
	}
}
