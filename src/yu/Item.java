package yu;

import java.text.DecimalFormat;

public class Item {
	public double length;
	public double factor;
	public double price;
	public String name;
	public int count;

	public Item(String name, double length, double factor, double price, int count) {
this.name = name;
		this.length = length;
		this.factor = factor;
		this.price = price;
		
		this.count = count;
	}

	public Item() {
		 
	}

	public double calc() {
		double amount = length * factor * price*count;
		DecimalFormat df=new DecimalFormat("#.00"); 
		 amount = new Double(df.format(amount));
		System.out.println(name+": "+ amount + "\t(单价"+price + " 长度"+ length +"因子"+factor +  " 个数"+count +")"
				 );
		 
		 
		return amount;
	}
}
