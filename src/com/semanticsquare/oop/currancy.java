//public class Instructor {
//    public long id;
//	public String name;
//	public String title;
//	public String department;
//	public Book[] books;
//	
//	public Instructor(long id, String name, String title, String department, Book[] books) {
//		// your code
//	}
//	
//	public Instructor(long id, String name, String title, String department) {
//		// your code
//	}
//	
//	public Instructor(long id, String name, String title) {
//		// your code
//	}
//	
//	public Instructor(long id, String name) {
//		// your code
//	}
//	
//	public String getMostRecentBookTitle() {
//		// your code
//	}
//	
//	public Book updateBook(int index, String title) {
//		// your code
//	}
//	
//	public Book updateBook(int index, Book book) {
//		// your code
//	}
//	
//	public static void main(String[] args) {
//		Book book1 = new Book("Java for Beginners");
//        Book book2 = new Book("Scala for Beginners");
//        Book book3 = new Book("Effective Python");
//		
//		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
//		System.out.println(instructor.getMostRecentBookTitle());
//		System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
//				
//		Book book4 = new Book("Introduction to Data Mining");
//		System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
//	}
//}
