package com.springdemos.SpringCore.ShoppingCart;

public class Cart {
	String Cname;
	@Override
	public String toString() {
		return "ShoppingCart [Cname=" + Cname + ", item=" + item + "]";
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	Items item;
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
}
