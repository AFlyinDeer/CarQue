import java.util.*;

public class CarPriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue < Car > carPQ = new PriorityQueue < > ();
        //Change the values below to increase or decrease the the range.
        Integer size = getRandomNumber(5, 10);
        String makes[] = new String[] {
            "Ford",
            "Cevy",
            "Porsce",
            "Mercury",
            "Jeep",
            "Caddilac",
            "Tesla",
            "Honda",
            "Hyundai",
            "Toyota"
        };
        String models[] = new String[] {
            "F150",
            "Corvette",
            "Boxter",
            "Sable",
            "Wrangler",
            "CR20",
            "Model S",
            "Civic",
            "Veloster",
            "Camry"
        };
        String trims[] = new String[] {
            "Basic",
            "Sports",
            "Luxury",
            "Off-Road",
        };


        for (Integer i = 0; i < size; i++) {
        //Procedurally generate cars from lists of makes and models.
            Integer year = getRandomNumber(1995, 2022);
            String make = makes[getRandomNumber(1, 10)];
            String model = models[getRandomNumber(1, 10)];
            String trim = trims[getRandomNumber(1, 4)];
            Car car = new Car(year, make, model, trim);
            carPQ.add(car);
        }
        //USE A LOOP TO POLL THE ELEMENTS IN THE QUEUE AND PRINT THEM IN ASCENDING ORDER
        System.out.println("Size of the priority queue is: " + size);
        while (!carPQ.isEmpty()) {
            Car c = carPQ.poll();
            System.out.println(c);
        }


    }
    public static int getRandomNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

}