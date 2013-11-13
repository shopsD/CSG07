package uk.ac.aber.cs221.group07.walktourcreator.model;

import java.util.Date;


/**
 * This class stores a map position and records the time at which is was taken
 */
public class LocationPoint {

	/**
	 * holds the distance (east-west) from Greenwich)
	 */
	private double longitude;
	
	/**
	 * holds the distance (north-south) from the equater)
	 */
	private double latitude;
	
	/**
	 * keeps a record of when the location was captured 
	 */
	private Date time;
	
	/**
	 * allows sub classes to not have constructor
	 */
	public LocationPoint(LocationPoint p){
		this.latitude = p.latitude;
		this.longitude = p.longitude;
		this.time = p.time;
	}
	
	/**
	 * creates new LoactionPoint
	 * 
	 * @param x the longitude position
	 * @param y the latitude position
	 */
	public LocationPoint(double x,double y){
		longitude=x;
		latitude=y;
		long mil = System.currentTimeMillis();
		time = new Date(mil);
	}
	/**
	 * @return the Time that the recording was made
	 */
	protected Date getTime(){
		return time;
	}
	
	/**
	 * works out the distance between two 
	 * @param point the Location the you want the know the distance of
	 * @return the distance between itself and the given Location
	 */
	protected double distanceTo(LocationPoint point){
		//the following function works for a 2D plane
		// I think is should be different for the globe
		double tempX;
		double tempY;
		tempX = longitude-point.longitude;
		tempY = latitude-point.longitude;
		return Math.sqrt(tempX*tempX+tempY*tempY);
	}
}