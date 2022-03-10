package com;

public class Book {
private int bid;
private String name;
private float price;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", name=" + name + ", price=" + price + "]";
}
public Book(int bid, String name, float price) {
	super();
	this.bid = bid;
	this.name = name;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}

}
