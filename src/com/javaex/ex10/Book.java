package com.javaex.ex10;

public class Book {

	private int bookNumber;
	private String bookName;
	private String bookWriter;
	private int stock;

	public Book() {

	}
	
	public Book(int bookNumber, String bookName, String bookWriter) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.stock = 1;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	public void displayBookInfo() {
		if(getStock()==2) {
			System.out.println(bookNumber + ". 책 제목: " + bookName + ", 작가: " + bookWriter + ", 대여 유무: 대여 중");
		} else {
			System.out.println(bookNumber + ". 책 제목: " + bookName + ", 작가: " + bookWriter + ", 대여 유무: 재고있음");
		}
		
	}
	

}
