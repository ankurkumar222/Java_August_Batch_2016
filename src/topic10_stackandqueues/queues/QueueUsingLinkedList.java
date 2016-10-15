package topic10_stackandqueues.queues;

public class QueueUsingLinkedList<T> {

	LinkedListNode<T> front;
	LinkedListNode<T> rear;
	int size;

	QueueUsingLinkedList() {
		size = 0;
	}

	public void enqueue(T data) {
		LinkedListNode<T> nyaNode = new LinkedListNode<>(data);
		if (rear == null) {
			front = nyaNode;
			rear = nyaNode;
		} else {
			rear.next = nyaNode;
			rear = nyaNode;
		}
	}

	public T dequeue() {

	}

	int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

}
