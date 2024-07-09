class Laptop{

	static boolean isLaptopOn = false ;
	
	public static void turnOn(){
		
		System.out.println("Start of turnOn method");
		
		if(isLaptopOn == false){
			isLaptopOn = true;
			System.out.println("Laptop is turned on");
		}
		System.out.println("End of turnOn method");
	return;
	}
	
	public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isLaptopOn == true){
			isLaptopOn = false;
			System.out.println("Laptop is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}