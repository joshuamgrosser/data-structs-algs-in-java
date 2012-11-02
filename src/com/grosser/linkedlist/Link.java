package com.grosser.linkedlist;

/**
 * Represents a single link in a linked list. Contains a reference to the next link
 * plus two String value objects.
 * 
 * @author joshuagrosser
 */
public class Link {
	
	private Link next = null;
	private String someValue;
	private String someOtherValue;
	
	/**
	 * Create a new Link with a reference to the next link.
	 * @param next Reference to the next link in the list.
	 */
	public Link(String val1, String val2){
		this.someValue = val1;
		this.someOtherValue = val2;
	}
	
	/**
	 * @return a reference to the next link in the list.
	 */
	public Link getNext() {
		return next;
	}

	/**
	 * @param next reference to the next link in the list.
	 */
	public void setNext(Link next) {
		this.next = next;
	}

	/**
	 * @return some value
	 */
	public String getSomeValue() {
		return someValue;
	}

	/**
	 * @param someValue some value
	 */
	public void setSomeValue(String someValue) {
		this.someValue = someValue;
	}

	/**
	 * @return some other value
	 */
	public String getSomeOtherValue() {
		return someOtherValue;
	}

	/**
	 * @param someOtherValue some other value
	 */
	public void setSomeOtherValue(String someOtherValue) {
		this.someOtherValue = someOtherValue;
	}
	
	@Override
	public String toString() {
		return "Link contents: " + this.getSomeValue() + ", " + this.getSomeOtherValue();
	}
}
