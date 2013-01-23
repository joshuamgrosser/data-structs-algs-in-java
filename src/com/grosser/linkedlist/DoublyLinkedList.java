package com.grosser.linkedlist;

public class DoublyLinkedList {
	
	/**
	 * Reference to the first link in the list.
	 */
	protected DoublyLinkable first;
	
	/**
	 * Reference to the last link in the list.
	 */
	protected DoublyLinkable last;
	
	/**
	 * Creates a new instance of DoublyLinkedList.
	 */
	public DoublyLinkedList(){
		
		// Sets the first link to null
		this.setFirst(null);
		
		// Sets the last link to null
		this.setLast(null);
	}
	
	/**
	 * Inserts a link at the beginning of the list.
	 */
	public void insertFirst(DoublyLinkable link){

		// Set the previous reference on the new link to null
		link.setPrevious(null);
		
		// Set the next reference on the new link to the first link
		link.setNext(getFirst());
		
		// Set the original first link's previous reference to the new link
		getFirst().setPrevious(link);
		
		// Set the linked list's first reference to the new link
		setFirst(link);
	}
	
	/**
	 * Inserts a link at the end of the list.
	 */
	public void insertLast(DoublyLinkable link){
		
		// Set the next reference on the new link to null
		link.setNext(null);
		
		// Set the previous reference on the new link to the last link
		link.setPrevious(getLast());
		
		// Set the original last link's next reference to the new link 
		getLast().setNext(link);
		
		// Set the list's last reference to the new link
		setLast(link);
	}
	
	/**
	 * @param newLink
	 * @param currentLink
	 */
	public void insertBefore(DoublyLinkable newLink, DoublyLinkable currentLink){
		
		// Set the next reference on the new link to the be the current link
		newLink.setNext(currentLink);
		
		// Set the previous reference on the new link to be the current link's previous reference
		newLink.setPrevious(currentLink.getPrevious());
		
		// Set the previous link's next reference to the new link
		newLink.getPrevious().setNext(newLink);
		
		// Set the next link's previous reference to the new link
		currentLink.setPrevious(newLink);
	}
	
	/**
	 * @param newLink
	 * @param currentLink
	 */
	public void insertAfter(DoublyLinkable newLink, DoublyLinkable currentLink){
		
		// Set the previous reference on the new link to be the current link
		newLink.setPrevious(currentLink);
		
		// Set the next reference on the new link to be the current link's next reference
		newLink.setNext(currentLink.getNext());
		
		// Set the previous reference on the next link to be the current link
		newLink.getNext().setPrevious(newLink);
		
		// Set the next reference on the current link to be the new link
		currentLink.setNext(newLink);
	}
	
	/**
	 * @return the first link
	 */
	public DoublyLinkable getFirst() {
		return first;
	}

	/**
	 * @param first
	 */
	public void setFirst(DoublyLinkable first) {
		this.first = first;
	}

	/**
	 * @return the last link
	 */
	public DoublyLinkable getLast() {
		return last;
	}

	/**
	 * @param last
	 */
	public void setLast(DoublyLinkable last) {
		this.last = last;
	}
}
