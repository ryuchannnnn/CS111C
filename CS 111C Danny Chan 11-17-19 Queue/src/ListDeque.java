public class ListDeque<T> implements DequeInterface<T> {
	private T[] list;
	int current;
	int firstindex;
	int backindex;

	public ListDeque() 
	{
		current =0;
		firstindex = 0;
		backindex = list.length;
	}
	public void addToFront(T newEntry) 
	{
		if(current < 0)
			current = (int) list[current+1];
		list[current]= newEntry;
	}
	public void addToBack(T newEntry) 
	{
		if(current <=0)
			current = (int) list[current-1];
		list[current]= newEntry;
	}
	public T removeFront() 
	{
		if(isEmpty()) {
			return null;
		} 
		else 
		{
			T front = (T) list[firstindex];
			list[firstindex] = null;
			firstindex = (int) list[firstindex+1];
			return front;

		}
	}
	public T removeBack() 
	{
		if(isEmpty()) 
		{
			return null;
		}
		else 
		{
			if(backindex !=0) 
			{
				T back = (T)list[backindex];
				list[backindex] = null;
				backindex = (int)list[backindex -1];
				return back;
			}
		}
		return null;
	}
	public T getFront() 
	{
		return list[firstindex];
	}
	public T getBack() 
	{
		return list[backindex];
	}
	public boolean isEmpty() 
	{
		return (list.length ==0);

	}
	public void clear() 
	{
		if(isEmpty()) 
		{
			for(int index= firstindex;index!=backindex;index = index+1) 
			{
				list[index] = null;
			}
			list[backindex]=null;
		}
		firstindex = 0;
		backindex = list.length -1;

	}
}




