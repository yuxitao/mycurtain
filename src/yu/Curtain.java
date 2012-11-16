package yu;

public class Curtain {
	 String name;
	 double length;
	 double factor;
	  
	
	public Curtain(String name, double length, double factor) {
		super();
		this.name = name;
		this.length = length;
		this.factor = factor;
	}

	public double calc()
	{
		
		//String name, float length, float factor, float price, int count
		Item item_cloth = new Item("布/纱", length, factor, 50, 1 );
		double  cloth = item_cloth.calc();
		
		Item item_chen = new Item("衬", length, factor, 10, 2 );
		double chen=item_chen.calc();
		
		Item item_pole = new Item("杆", length, 1, 20, 2 );
		double pole = item_pole.calc();
		
		Item item_ring = new Item("环", length, factor, 1.5, 12 );
		double ring = item_ring.calc();
		 
		//Item item_ear = new Item("穗", length, factor, 10, 1 );
		//double ear = item_ear.calc();
		
		double total = cloth + chen + pole + ring ;
		
		System.out.println(name+"="+ total);
		return total;
	}
	 
}
	

