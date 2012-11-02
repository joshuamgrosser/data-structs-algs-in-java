package com.grosser.linkedlist;

public class LinkedList {
	
	/**
	 * @param args command-line arguments
	 */
	public static void main(String[] args){
		Link first = new Link("test", "abc");
		LinkedList linkedList = new LinkedList(first);
		
		Link linkA = new Link("A", "This is link A");
		Link linkB = new Link("B", "This is link B");
		linkedList.insert(linkA);
		linkedList.insert(linkB);
		
		System.out.println(linkedList.toString());
	}
	
	private Link first;
	
	/**
	 * Creates a new linked list with a single link.
	 * @param first The first link in the list.
	 */
	public LinkedList(Link first){
		this.setFirst(first);
	}

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	/**
	 * Inserts a new link at the front of the list.
	 * @param link The link to insert.
	 */
	public void insert(Link link){
		link.setNext(this.first);
		this.setFirst(link);
	}
	
	/**
	 * Deletes the link at the front of the list.
	 */
	public void delete(){
		Link head = this.getFirst();
		this.setFirst(head.getNext());
	}
	
	@Override
	public String toString() {
		Link current = this.getFirst();
		String val = "";
		
		while(current != null){
			val += current.toString() + "\n";
			current = current.getNext();
		}
		
		return val;
	}
	
}
