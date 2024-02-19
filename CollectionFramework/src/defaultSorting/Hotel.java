package defaultSorting;

public class Hotel implements Comparable<Hotel> {
	String name;
	Double rating;//WRAPPER CLASS DECLARATION TO CALL COMPARE TO()
	Hotel(String name,double rating)
	{
		this.name=name;
		this.rating=rating;
		
	}
	@Override
	public String toString()
	{
		return " NAME: "+this.name+" Ratings: "+this.rating;
	}
	@Override
	public int compareTo(Hotel h)
	{
		//return (int) (this.rating-h.rating);
		//return (new Double (this.rating). compareTo(new Double(h.rating)));
		return this.rating.compareTo(h.rating);
	}
	/**
	 * IF ratings IS DECLARED AS PRIMITIVE DOUBLE:
	 * @OVERRIDE
	 * public int compareTo(Hotel h)
	 * {
	 * 	 Double x=this.ratings;//Auto-Boxing
	 * 	 Double y=h.rating;//Auto-Boxing
	 *   return x.compareTo(y);
	 */
	

}
