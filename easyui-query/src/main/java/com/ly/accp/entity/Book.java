package com.ly.accp.entity;
/**
 * 书籍表
 * @author Administrator
 *
 */
public class Book {
	private int bookid;//书籍id
	private String title;//书籍标题
	private float price;//书籍价格
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
