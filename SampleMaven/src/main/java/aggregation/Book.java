package aggregation;

public class Book {
	String bookname;
	int publishdate;
	String lang;
	Author a;
public Book(String bookname,int publishdate,String lang,Author a)
{
	this.bookname=bookname;
	this.publishdate=publishdate;
	this.lang=lang;
	this.a=a;
	
}
public void display()
{
	System.out.println("Book Name:"+bookname);
	System.out.println("Publish Date:"+publishdate);
	System.out.println("Language:"+lang);
	System.out.println("Author name:"+a.authorname);
	System.out.println("Birth year:"+a.birthyr);
}
	public static void main(String[] args) {
		Author obj=new Author("Tolkien",1876);
		Book obj1=new Book("The Hobbit",1999,"English",obj);
		obj1.display();
		

	}

}
