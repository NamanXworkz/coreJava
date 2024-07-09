class LaptopRunner{
	
	public static void main(String[] tester){
		System.out.println("Start of main method");
		
		Laptop.turnOn();
		Laptop.turnOff();
		Laptop.turnOn();
		Laptop.turnOff();
		
		System.out.println("End of main method");
	}
}