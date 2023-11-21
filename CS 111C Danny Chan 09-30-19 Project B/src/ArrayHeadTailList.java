public class ArrayHeadTailList<T> implements HeadTailListInterface<T> {
	private T[] listArray;
	private int numberOfElements;
	private static int intSize=25;

	public ArrayHeadTailList(int initialCapacity){
		if (initialCapacity < 1) {
			initialCapacity = intSize;
		}
		listArray = (T[]) new Object[initialCapacity];
		numberOfElements = 0;
	}
	@Override
	public void addFront(T newEntry) {
		if(listArray[0] != null ){
			this.shiftBack();
		}
		numberOfElements++;
		listArray[0] = newEntry;
	}

	@Override
	public void addBack(T newEntry) {
		if(isEmpty()){
			listArray[0] = newEntry;
		} else {
			if(listArray[listArray.length-1] != null){
				makeRoom(); }
			listArray[numberOfElements] = newEntry;
		}

		numberOfElements++;
	}
	@Override
	public T removeFront() {
		if(numberOfElements>0){
			T temp = listArray[0];
			shiftUp();
			numberOfElements--;
			return temp;
		}
		return null;
	}

	@Override
	public T removeBack() {
		if(numberOfElements>0){
			T temp = listArray[numberOfElements-1];
			listArray[numberOfElements - 1] = null;
			numberOfElements--;
			return temp;
		}
		return null;
	}


	@Override
	public void clear() {
		int i=0;
		while(i<numberOfElements)
		{
			listArray[i]=null;
			i++;
		}
		numberOfElements=0;
	}

	@Override
	public T getEntry(int position) {
		if (!isEmpty() && (position > -1 && position <= numberOfElements)) {
			return listArray[position]; // reference to the indicated entry
		} else {
			return null; // according to interface specification, return null if index is out of bounds
		}
	}
	@Override
	public void display() {
		System.out.printf("%s elements; capacity = %s", String.valueOf(numberOfElements), String.valueOf(listArray.length));

		for(T item : listArray){
			if(item != null){
				System.out.println(item);
			}
		}
	}

	@Override
	public int indexOf(T anEntry) {
		int index=0;
		for(int i=0; i<numberOfElements;i++)
		{
			if(listArray[i]==anEntry) {
				index=i;
				break;
			}            
		}
		return index;
	}

	@Override
	public int lastIndexOf(T anEntry) {
		int index=0;
		for(int i=numberOfElements-1; i<numberOfElements; i--)
		{
			if(listArray[i]==anEntry) {
				index=i;
				break;
			}    
			else
				continue;
		}
		return index;
	}
	@Override
	public boolean contains(T anEntry) {
		int index=0;
		for(int i=0;i<numberOfElements;i++)
		{
			if(listArray[i]==anEntry)
			{
				index=i;
				break;
			}
		}
		return(listArray[index]==anEntry);
	}

	@Override
	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		return(numberOfElements==0);
	}

	private void shiftBack(){

		if (numberOfElements + 1 > listArray.length){
			makeRoom();
		}
		for (int i = numberOfElements -1; i > -1; i--) {
			listArray[i + 1] = listArray[i];
		}

	}

	//Shifts elements forward in the list
	private void shiftUp(){
		if (numberOfElements + 1 > listArray.length){
			makeRoom();
		}
		for (int i = 0; i < numberOfElements -1; i++) {
			listArray[i] = listArray[i+1];
		}
	}

	//Increases the size of the list
	private int makeRoom(){
		T[] newArray = (T[]) new Object[listArray.length * 2];

		for (int i = 0; i < listArray.length; i++){
			newArray[i] = listArray[i];
		}
		listArray = newArray;
		return listArray.length;
	}
}