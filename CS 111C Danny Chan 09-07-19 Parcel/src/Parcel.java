// Name: Danny Chan
// Hw: 0 Review 
public class Parcel 
{
    private String id;
    private double weight;
    
    public Parcel(String id,double weight) 
    {
        this.id = id;
        this.weight = weight;
    }

    public Parcel() {
        id = " ";
        weight = 1.00;
    }
    public void setParcelid(String id)
    {
    	this.id=id;
    }public void setWeight(Double weight)
    {
    	this.weight=weight;
    }
    public String getParcelid()
    {
    	return id;
    }
    public double getWeight()
    {
    	return weight;
    }
    public String toString()
    {
    return "The parcel id number is " + id+ "and the weight of this parcel is " + weight + " pound(s).";   
    }
    public boolean meetsCriteria(char first, char second, int numberTimesSecond)
    {
        int secondCounter=0;
        for(int i=0;i<this.id.length();i++)
        {
            if(this.id.charAt(i)==first)
            {
                for(int j=i+1;j<this.id.length();j++)
                {
                if(this.id.charAt(j)==second)
                {
                    secondCounter++;
                    continue;
                }
                }
            }
        }
        if(secondCounter==numberTimesSecond)
        {
            return true;
        }
        else
            return false;
        
        
    }
}
