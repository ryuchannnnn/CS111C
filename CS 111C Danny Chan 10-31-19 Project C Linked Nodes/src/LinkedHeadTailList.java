public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

	private Node head, tail;
	private boolean initialized = false;
	private int numElements;

	public LinkedHeadTailList() {
		head = null;
		tail = null;
		numElements = 0;
		initialized = true;
	}

	public LinkedHeadTailList(T[] array) {
		this();
		for (int i = 0; i < array.length; i++) {
			addBack(array[i]);
		}
	}

	public void addFront(T newEntry) {
		if (newEntry != null) {
			if (head == null) {
				head = new Node(newEntry);
				tail = head;
			} else {
				head = new Node(newEntry, head);
			}
			numElements++;
		}
	}

	public void addBack(T newEntry) {
		if (newEntry != null) {
			if (tail == null) {
				tail = new Node(newEntry);
				head = tail;
			} else {
				Node newNode = new Node(newEntry);
				tail.next = newNode;
				tail = newNode;
			}
			numElements++;
		}
	}

	public T removeFront() {
		if (head != null) {
			Node temp = head;
			head = head.next;
			numElements--;
			if (numElements == 0) {
				tail = null;
			}
			return temp.data;
		}
		return null;
	}

	public T removeBack() {
		if (numElements == 1) {
			head = null;
			Node temp = tail;
			tail = null;
			numElements--;
			return temp.data;
		} else if (numElements > 1) {
			Node currentNode = head;
			int index = 0;
			while (index < numElements - 2) {
				currentNode = currentNode.next;
				index++;
			}
			Node temp = currentNode.next;
			currentNode.next = null;
			numElements--;
			tail = currentNode;
			return temp.data;
		}
		return null;
	}

	public boolean contains(T anEntry) {
		Node currentNode = head;
		int index = 0;

		while (currentNode != null) {
			if (currentNode.data.equals(anEntry)) {
				return true;
			} else {
				currentNode = currentNode.next;
				index++;
			}
		}
		return false;
	}

	public int indexOf(T anEntry) {
		int index=0;
		for(int i=0;i<numElements;i++) {
			if(anEntry.equals(getEntry(i))) {
				index=i;
				break;
			}
			else {
				index=-1;
			}
		}
		return index;
	}

	public int lastIndexOf(T anEntry) {
		int index=0;
		for(int i=numElements;i<=numElements;i--) {
			if(anEntry.equals(getEntry(i))) {
				index=i;
				break;
			}
			else {
				index=-1;
			}
		}
		return index;
	}

	public T getEntry(int givenPosition) {
		if (givenPosition == numElements - 1) {
			return tail.data;
		} else if (givenPosition >= 0 && givenPosition < numElements - 1) {
			Node currentNode = head;
			int index = 0;
			while (index < numElements - 1) {
				if (index == givenPosition) {
					return currentNode.data;
				} else {
					currentNode = currentNode.next;
					index++;
				}
			}
		}
		return null;
	}

	public void display() {
		Node currentNode = head;
		System.out.print("[");
		if (isEmpty()) {
			System.out.print("]\n");
		} else {
			System.out.print(currentNode.data);
			currentNode = currentNode.next;
			while (currentNode != null) {
				System.out.print(", " + currentNode.data);
				currentNode = currentNode.next;
			}
			System.out.printf("]\thead=%s\ttail=%s\n", head.data, tail.data);
		}
	}

	public void clear() {
		head = null;
		tail = null;
		numElements = 0;
	}

	public boolean isEmpty() {
		return numElements == 0;
	}

	public int size() {
		return numElements;
	}

	private class Node {
		private T data; 
		private Node next; 

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		}

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}

		private T getData() {
			return data;
		}

		private void setData(T newData) {
			data = newData;
		}

		private Node getNextNode() {
			return next;
		}

		private void setNextNode(Node nextNode) {
			next = nextNode;
		} 
	} 
}
