package Tugaspertemuan3;

public class node {
	
	int data;
	node next;
	
	public node(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext (node next) {
		this.next = next;
	}
	
	public double getData() {
		return this.data;
	}
	
	public node getNext() {
		return this.next;
	}
}
