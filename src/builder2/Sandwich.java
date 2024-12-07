package builder2;

import java.util.ArrayList;

public class Sandwich {

		private String bread;
		private ArrayList<String> spreads;
		private ArrayList<String> meats;
		private ArrayList<String> salads;
		
		public Sandwich(Builder builder) {
			bread = builder.bread;
			spreads = builder.spreads;
			meats = builder.meats;
			salads = builder.salads;
		}
		
		
		
		//necemo praviti konstruktor sa vrijednostima, jer tako mozemo promijeniti samo po jednu
		
		//a opet necemo ni liste prosljedjivati kroz konstruktor jer to nije najbolji nacin, ali bi moglo
		
		//mi cemo koristiti unutrasnje klase - ona sluzi za dodavanje cega zelimo i koliko hocemo
		//klasa koja postoji unutar nadredjene/osnovne i ona mora biti STATICKA
		
		
		@Override
		public String toString() {
			return "Sandwich [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads
					+ "]";
		}



		public static class Builder{
			private String bread;
			private ArrayList<String> spreads;
			private ArrayList<String> meats;
			private ArrayList<String> salads;
			
			public Builder(String bread) {
				this.bread = bread;
				spreads = new ArrayList<String>();
				meats = new ArrayList<String>();
				salads = new ArrayList<String>();
			}

			//proslijedicemo stringove koji ce se pojedinacno dodavati u ArrayList
			public Builder spread(String spread) {
				spreads.add(spread);
				return this;
			}

			public Builder meat(String meat) {
				meats.add(meat);
				return this;
			}

			public Builder salad(String salad) {
				salads.add(salad);
				return this;
			}
			
			public Sandwich build() {
				return new Sandwich(this);
			}
			
			
			
		}
}
