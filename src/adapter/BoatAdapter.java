package adapter;



//ovo je prvi nacin i mi ga radimo u projektu - KOMPOZICIJA
public class BoatAdapter implements Vehicle {
	//mi cemo imati heksagonAdapter koji implementira Shape
	private Boat boat;
	
	
	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}


	@Override
	public void goFaster() {
		boat.rowFaster();

	}
	
	/*
	 * hexagon.jar fajl na sovi
	 * PREBACITI U FOLDER PROJEKTA - jer putanja mora biti relativna, a ne apsolutna
	 * desni klik na projekat -> propertires -> java build path -> odaberemo librarires gore -> dodavanje jar fajla desno na add? -> treba se onda prikazati u bibliotekama koje se koriste
	 * 
	 * */
	
	

}
