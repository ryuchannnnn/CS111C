public class Movie implements Comparable<Movie>{
	private String name;
	private int year;
	public Movie(String name, int year)
	{
		this.name = name;
		this.year = year;
	}
	public int compareTo(Movie m)
	{
		if(this.year<=m.year)
		{
			return -1;
		}
		else if(this.year==m.year)
		{
			if(this.name.compareTo(m.name)==-1)
			{
				return -1;
			}
			else if(this.name.compareTo(m.name)==0)
			{
				return 0;
			}
			else
				return 1;
		}
		else
			return 0;

	}
}