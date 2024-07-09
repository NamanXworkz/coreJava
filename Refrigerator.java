class Refrigerator{

	static boolean isRefrigeratorOn = false ;
	
	public static void OnOeOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isRefrigeratorOn == false){
			isRefrigeratorOn = true;
			System.out.println("Refrigerator is turned on");
		}else if(isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			System.out.println("Refrigerator is turned off");
		}
		System.out.println("End of turnOn method");
	return;
	}
}	
	/*public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isRefrigeratorOn == true){
			isRefrigeratorOn = false;
			System.out.println("Refrigerator is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}*/