public class SaloonCar{
	int cc;
	
	String color;
	
	int seats;

	static int wheels = 4;

	protected int doors = 4;

	private String fuel = "Petrol";

	String getFuel(){
		return fuel;
	}

	void SaloonCars(){
		int cc = 2000;
		String color = "White";
		int seats = 4;
	}

	 (String model){
		switch (model) {
			case "Toyota":
			int cc = 1500;
			string color = "grey";
			int seats = 5;
			break;

			case "Mercedes":
			int cc = 2500;
			String color = "blue";
			int seats = 5;
			break;

			case "Prado":
			int cc = 3000;
			String color = "Yellow";
			int seats = 7;
			break;
			
			default:
			int cc = 2000;
			String color = "White";
			int seats = 4;
		}
	}
	public static void main(String args[]){
		SaloonCar obj = new SaloonCar("Black");
		System.out.println("Value of wheels is : "+obj.wheels);
		System.out.println("Value of cc is: "+obj.cc);
		System.out.println("Value of color is "+obj.color);
		System.out.println("Value of seats is "+obj.seats);
		obj.moveFoward ();
	}
	public static void moveFoward (){
		String movement = "Moving Forward";
		System.out.println("The car is : "+movement);
	}
}
