package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		//cvrsta veza izmedju adaptera i pojedinacnih klasa nije bas dobra praksa
		/*
		Car car = new Car();
		Plane plane = new Plane();
		Train train = new Train();
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat);
		*/
		
		//ovo je bolja praksa
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);
		Hexagon h = new Hexagon();
		
		
		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boatAdapter.goFaster();
		h.drawHexagon();
		
		
		
	}

}
