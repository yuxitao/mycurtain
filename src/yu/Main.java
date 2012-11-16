package yu;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curtain curtain = new Curtain("主卧",3.2 ,1.7);
		double t_curtain=	curtain.calc();
		System.out.println();
		
		Hall hall = new Hall("客厅",3.2 ,1.7);
		double t_hall = hall.calc();
		System.out.println();
		
		Northroom northroom = new Northroom("次卧",2.7,1.7);
		double t_northroom=	northroom.calc();
		//System.out.println("\n书房=100\n");
		
		double total = t_curtain + t_hall + t_northroom ;
		System.out.println("总价 = "+ total);
		
		
	}

}
