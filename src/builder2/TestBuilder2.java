package builder2;

public class TestBuilder2 {
	
	//ovdje konkretno zavisi od korisnika kakva ce obiljezja biti
	
	//builder 1 unaprijed znamo tacne vrijednosti
	//builder 2 fleksibilni smo sa njima

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralno");
		
		builder.spread("maj").spread("pav").meat("sunka").salad("zelena").spread("kecap");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);

	}

}
