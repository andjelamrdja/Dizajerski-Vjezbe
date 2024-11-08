package command;

import mvc.Point;

//modifikaciju radimo za svaki oblik posebno
//mozemo kreirati posebne klase, a mozemo u jednoj pa da provjeravamo preko instanceof pa provjeravamo kojem obliku pripada
//mozda je zbog organizacije lakse raditi odvojeno

public class UpdatePointCmd implements Command {

	//ovo konkretno moze copy/paste
	//greska je da ovdje proslijedimo model
	//znaci objekat koji mijenjamo i vrijednosti za novi objekat samo trebaju
	
	private Point point;
	private Point newState;
	private Point oldState = new Point(); //moramo negdje cuvati vrijednosti kako bismo mogli odraditi unexecute
	
	//popraviti u mojoj modifikaciji da se ne kreira novi objekat, a stari brise - nego se mijenja postojeci
	public UpdatePointCmd(Point point, Point newState) {
		super();
		this.point = point;
		this.newState = newState;
	}
	
	@Override
	public void execute() {
		//ako odradimo samo point = newState tako smo samo promijenili pokazivac ---> TO NE MOZE
		//mi moramo pristupiti objektu point da bismo ga promijenili
		
		//prvu cuvamo staru vrijednost dok je imamo
		oldState.setX(point.getX());
		oldState.setY(point.getY());
		oldState.setColor(point.getColor());
		
		point.setX(newState.getX());
		point.setY(newState.getY());
		point.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		point.setX(oldState.getX());
		point.setX(oldState.getX());
		point.setX(oldState.getX());
	}

}
