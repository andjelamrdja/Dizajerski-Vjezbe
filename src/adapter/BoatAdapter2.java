package adapter;

//drugi nacin za povezivanje - iako je lakse, bolje je raditi prvi slucaj - PROSIRIVANJE
public class BoatAdapter2 extends Boat implements Vehicle {

	@Override
	public void goFaster() {
		rowFaster();
	}


}
