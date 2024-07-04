class Swiggy{
	public static void main(String[] item){
		System.out.println("Main started");
		
		String name = "Swiggy";
		String nonvegStarters[] = {"CHICKEN MANCHURIAN","CHICKEN CHILLI/CRISPY","CHICKEN LEMON/GINGER","CHICKEN PEPPER","CHICKEN CORIANDER","CHICKEN PUDINA","CHICKEN SHANGRILLA","CHICKEN MAJESTIC","PERI PERI CHICKEN","SCHEZWAN CHICKEN"};
		String vegStarters[] = {"PANEER CHILLY","PANEER MANCHURIAN","PANEER PEPPER","MUSHROOM PEPPER","MUSHROOM CHILLY","MUSHROOM MANCHURIAN","BABY CORN CHILLY","DRY GOBI","GOBI MANCHURIAN","BABY CORN"};
		String nonvegMainCourses[] = {"BUTTER CHICKEN","KADHAI CHICKEN","CHICKEN MANCHOW","CHICKEN NOODLE","EGG CHOWMEIN","TIKKA MASALA","CHICKEN CHOWMEIN","CHICKEN BIRYANI","CHICKEN CHOWMEIN","EGG BIRYANI","TANDOORI CHICKEN"};
		String vegMainCourses[] = {"KERALA PARATHA","CYLON PARATHAJZ","PAPS PAROTHA","MALAI KOFTA","KONDATTAM MORU KULAMBU","PANEER LABABDAR","BAINGAN BHARTA","KAPPA THALICHATHU","VEG TULUNADU MAIN COURSE GASSI","CHANA MASALA"};
		
		System.out.println("Welcome to "+name);
		System.out.println("***************");
		System.out.println("AVAILABLE NON VEG STARTER ARE");
		for (String nonvegStarter : nonvegStarters){
			System.out.println(nonvegStarter);
		}
		
		System.out.println("***************");
		System.out.println("AVAILABLE VEG STARTER ARE");
		for (String vegStarter : vegStarters){
			System.out.println(vegStarter);
		}
		
		System.out.println("***************");
		System.out.println("AVAILABLE NON VEG MAIN COURSE ARE");
		for (String nonvegMainCourse : nonvegMainCourses){
			System.out.println(nonvegMainCourse);
		}
		
		System.out.println("***************");
		System.out.println("AVAILABLE VEG MAIN COURSE ARE");
		for (String vegMainCourse : vegMainCourses){
			System.out.println(vegMainCourse);
		}
		
		System.out.println("---------------");
		
		System.out.println("Main ended");
		
	}
}