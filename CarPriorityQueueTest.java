import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author Chander
 *
 */
public class CarPriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Car> carPQ = new PriorityQueue<Car>();
		//ADD 5 to 10 CAR OBJECTS
      carPQ.add(2015, "Ford", "Focus"); //Ford Focus
      carPQ.add(2022, "Toyota", "Camry"); //Toyota Camry
      carPQ.add(2020, "Honda", "Civic"); //Honda Civic
      carPQ.add(2004, "Jeep", "Wrangler TJU"); //Jeep Wrangler TJU
      carPQ.add(2005, "Ford", "Mustang"); //Ford Mustang
				
		//USE A LOOP TO POLL THE ELEMENTS IN THE QUEUE AND PRINT THEM IN ASCENDING ORDER
      while (!PriorityQueue.isEmpty()) {
            System.out.println(PriorityQueue.remove());
        }
	}

}