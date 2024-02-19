package sortingObjects;

public class Car implements Comparable<Car>{
	int cost;
	Car(int cost)
	{
		this.cost=cost;
	}
	@Override
	public String toString()
	{
		return "Cost:"+this.cost;
	}
	@Override
	public int compareTo(Car c)//c-->ALREADY EXISTING OBJECT
	{
		return this.cost-c.cost;//this-->CURRENT OBJECT TO BE INSERTED
	}

}
