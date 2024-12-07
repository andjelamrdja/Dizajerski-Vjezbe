package builder1;

public class Pizza {
	private String dough;
	private String cheese;
	private String meat;
	private String sauce;
	
	

	
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", cheese=" + cheese + ", meat=" + meat + ", sauce=" + sauce + "]";
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	
}
