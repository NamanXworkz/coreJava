class Camera{

	static boolean isCameraOn = false ;
	
	public static void onOrOff(){
		
		System.out.println("Start of turnOn method");
		
		if(isCameraOn == false){
			isCameraOn = true;
			System.out.println("Camera is turned on");
		}else if(isCameraOn == true){
			isCameraOn = false;
			System.out.println("Camera is turned off");
		}
		System.out.println("End of turnOn method");
	return;
	}
}
	/* public static void turnOff(){
		
		System.out.println("Start of turnOff method");
		
		if(isCameraOn == true){
			isCameraOn = false;
			System.out.println("Camera is turned off");
		}
		System.out.println("End of turnOff method");
	return;
	}
}*/