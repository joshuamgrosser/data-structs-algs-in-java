package com.grosser.linkedlist;

public class Dequeue implements DoublyQueueable {
	
	/**
	 * Dequeue implementation is based on a doubly linked list implementation.
	 */
	protected DoublyLinkableList list;

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#pushFront(java.lang.Object)
	 */
	@Override
	public void pushFront(DoublyLinkable item) {
		list.insertFirst(item);
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#pushRear(java.lang.Object)
	 */
	@Override
	public void pushRear(DoublyLinkable item) {
		list.insertLast(item);
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#popFront()
	 */
	@Override
	public DoublyLinkable popFront() {
		return list.getFirst();
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#popRear()
	 */
	@Override
	public DoublyLinkable popRear() {
		DoublyLinkable rear = list.getLast();
		list.setLast(rear.getPrevious());
		return rear;
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#peekFront()
	 */
	@Override
	public DoublyLinkable peekFront() {
		DoublyLinkable front = list.getFirst();
		list.setFirst(front.getNext());
		return front;
	}

	/* (non-Javadoc)
	 * @see com.grosser.linkedlist.DoublyQueueable#peekRear()
	 */
	@Override
	public DoublyLinkable peekRear() {
		return list.getLast();
	}
}
