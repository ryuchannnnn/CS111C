public class Trio<T> {
	private T obj1, obj2, obj3;
	public Trio(T obj1, T obj2, T obj3)
	{
		this.obj1=obj1;
		this.obj2=obj2;
		this.obj3=obj3;
	}
	public T getObj1()
	{
		return obj1;
	}
	public T getObj()
	{
		return obj2;
	}
	public T getObj3()
	{
		return obj3;
	}
	public void setObj1(T obj1)
	{
		this.obj1=obj1;
	}
	public void setObj2(T obj2)
	{
		this.obj2=obj2;
	}
	public void setObj3(T obj3)
	{
		this.obj3=obj3;
	}
	public String toString()
	{
		return "Obj1: " +obj1+"\nObj2: "+obj2+"\nObj3: "+obj3;
	}

}


