package com.ly.accp.entity;
/**
 * �鼮��
 * @author Administrator
 *
 */
public class Book {
	private int bookid;//�鼮id
	private String title;//�鼮����
	private float price;//�鼮�۸�
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
