/**
 * 
 */

/**
 * @author Chander
 *
 */
public class Car implements Comparable<Car> {
	private int year;
	private String make;
	private String model;
	private String trim;
	
	public Car(int year, String make, String model, String trim) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.trim = trim;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}
	
	@Override
	public String toString() {
		return new String("Car:\t\t" + this.year + "\t\t" + this.make + "\t\t" + this.model + "\t\t" + this.trim);
	}

	
	/**
	 * This method will compare 2 cars. If car1's year is lesser it will return -1, if equal it will return 0, 
	 * and if greater it will return 1.
	 * @return 	-1 if car1's year is < car2's year
	 * 			0 if car1's year is == car2's year
	 * 			1 if car1's year is > car2's year
	 */
	public int compareTo(Car c2) {
	    //WRITE YOUR LOGIC HERE
       if (this.year < Car.getYear()) {
            return -1;
        } else if (this.year == Car.getYear()) {
            return 0;
        } else if (this.year > Car.getYear()) {
            return 1;
        }
	}
	
}
