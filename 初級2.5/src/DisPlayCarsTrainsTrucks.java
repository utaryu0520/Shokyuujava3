import java.util.Vector;

public class DisPlayCarsTrainsTrucks extends MyFrame{
	
	public void run() {
		Vector<Vehicle> vehicles = new Vector<Vehicle>();
		vehicles.add(new Car(10, 30, 3, 0));
		vehicles.add(new Car(10, 100, 5, 0));
		vehicles.add(new Train(10, 150, 7, 0));
		vehicles.add(new Train(10, 170, 0, 0));
		vehicles.add(new Truck(10, 210, 3, 0));
		vehicles.add(new Truck(10, 240, 5, 0));
		
		while(true) {
			clear();
			 for(int j = 0; j < vehicles.size(); j++) {
					vehicles.get(j).draw(this);
					vehicles.get(j).move();
				}
				sleep(0.1);
		}
	}
}
