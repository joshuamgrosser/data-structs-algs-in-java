package com.grosser.linkedlist;

/**
 * Represents a double-ended link for a doubly linked list. Contains a reference to the
 * previous link as well as the next link.
 * 
 * @author joshuagrosser
 */
public class DoubleEndedLink implements DoublyLinkable {
	
	/**
	 * Reference to the previous link.
	 */
	protected DoublyLinkable previous = null;
	
	/**
	 * Reference to the next link.
	 */
	protected DoublyLinkable next = null;
	
	/**
	 * Link data.
	 */
	protected LinkData data = null;

	public DoubleEndedLink(int key, String value, String anotherValue,
			String yetAnotherValue) {
		this.data.setKey(key);
		this.data.setValue(value);
		this.data.setAnotherValue(anotherValue);
		this.data.setYetAnotherValue(yetAnotherValue);
	}
	
	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#getNext()
	 */
	public DoublyLinkable getNext() {
		return next;
	}
	
	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#getPrevious()
	 */
	@Override
	public DoublyLinkable getPrevious() {
		return previous;
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#setNext(com.grosser.linkedlist.DoublyLinkable)
	 */
	@Override
	public void setNext(DoublyLinkable next) {
		this.next = next;
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#setPrevious(com.grosser.linkedlist.DoublyLinkable)
	 */
	@Override
	public void setPrevious(DoublyLinkable previous) {
		this.previous = previous;
	}
	
	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#getData()
	 */
	@Override
	public LinkData getData() {
		return data;
	}
	
	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyLinkable#setData(com.grosser.linkedlist.LinkData)
	 */
	@Override
	public void setData(LinkData data) {
		this.data = data;
	}
}
