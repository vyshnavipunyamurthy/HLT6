package org.sample;

public class Book {
	String title;
	String author;
	int number_Of_Pages;
	String publisher;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumber_Of_Pages() {
		return number_Of_Pages;
	}
	public void setNumber_Of_Pages(int number_Of_Pages) {
		this.number_Of_Pages = number_Of_Pages;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setTitle("Murder On Orient Express");
		b1.setAuthor("Agatha Christie");
		b1.setNumber_Of_Pages(256);
		b1.setPublisher("Collins Crime Club");
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getNumber_Of_Pages());
		System.out.println(b1.getPublisher());
		System.out.println("==============");
		System.out.println("Book Title:"+b1.getTitle());
		System.out.println("Author of the Book:"+b1.getAuthor());
		System.out.println("Page Count:"+b1.getNumber_Of_Pages());
		System.out.println("Book Publisher:"+b1.getPublisher());
	}

}
