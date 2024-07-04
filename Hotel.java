class Hotel{
	public static void main(String[] foodmenu){
		System.out.println("Main started");
		
		String name = "Ganesh Grand";
		String foodMenu[] = {"Biriyani", "Paneer Butter Masala", "Sayi Paneer Kema Paneer", "Chicken Dam Biriyani","Egg Biriyani", "Paneer Burji","Palak Paneer Matter Paneer","Veg Biriyani","Paneer Chilly","Gee Rice","Paneer Manchurian","Jeera Rice","Dal Fry Tadka","White Rice Meals","Tomato Fry","Green Pees Masala","Boil Rice Meals","Channa Masala","Rajuma Masala","Fried Rice","Chicken Fried Rice","Egg Fried Rice","Mashroom Masala","Gobi Fried Rice","Aloo Gobi Shabji"};
		
		System.out.println("Welcome to "+name);
		System.out.println("***************");
		System.out.println("------MENU------");
		System.out.println("***************");
		for (String food : foodMenu){
			System.out.println(food);
		}
		
		System.out.println("***************");
		
		System.out.println("Main ended");
		
	}
}