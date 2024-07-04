class SuperMarket{
	public static void main(String[] market){
		System.out.println("Main started");
		
		String name = "AK Super Market";
		String groceries[]={"urad dal", "Wheat", "Rice", "Sugar", "Egg", "Bread", "Ragi", "salt", "pepper", "Mashroom", "Chan dal","pasta","meat","chickpea","dry ginger"};
		String vegetables[]={"Carrot", "Beans", "Ladie's fingers", "Onion", "Spinach", "Beetroot", "Black eyed beans", "broccoli", "dill", "endive"};
		String fruits[]={"Apple", "banana", "cherry", "fig", "blueberry", "guava", "grapes", "kiwi", "watermelon", "pineapple"};
		String perfumes[] ={"Wild Stone","Embark","Jaguar","Nautica","Davidoff","Dior","Calvin Klein","Dior Sauvage Eau de Parfum","Creed Aventus","Tom Ford Oud Wood","Bleu de Chanel","Acqua di Giò  Giorgio Armani","Yves Saint Laurent La Nuit de L'Homme","Paco Rabanne","Viktor & Rolf Spicebomb"};
		String iceCream[] ={"Vanilla ice cream","Baskin-Robbins","chocolates chip cookie dough ice cream","chocolates ice cream","Cookies and cream","Butter pecan","chocolates","Cold Stone Creamery","Häagen-Dazs","Natural Ice Cream","Green tea ice cream","Beckon Ice Cream","Banana ice cream","Strawberry ice cream","Mint chocolates chip"};
		String cosmetics[] ={"Mascara","Eyeshadow","Eyeliner","Foundation","Concealer","Blush","Makeup brushes","Lipstick","Compact powders","Primer","Setting Spray","Kajal","Highlighter","Contour","Bronzer"};
		String coolDrinks[] ={"Fanta","Campa Cola","Coca-Cola","Lemon","Canada Dry","Eskimo soft drinks","Ginger ale","RC Cola","J2O","Minute Maid","Mirinda","Energy drink","Mountain Dew","Sprite","Pepsi"};
		String alcohols[] ={"Absolut","Bacardi","Jack Daniel","Hennessy","Smirnoff","Crown Royal","Grey Goose","Chivas Regal","Captain Morgan","Johnnie Walker","Jägermeister","Jim Beam","Patrón","Baileys","Ballantine"};
		String milkProducts[] ={"Milk","Milk Powder","Cream","Whey","Butter","Fermented","Yogurt","Cheese","Custard","Frozen"};
		String snacks[] ={"tortilla chips","corn chips","potato chips","extruded products","pork rinds","pretzels","popcorn","nuts","seeds","Bhel Puri","Samosa"};
		String chocolates[] ={"Ferrero Rocher","Amul","Cadbury","Hershey chocolates","Toblerone chocolates","Ghirardelli","Lindt","Fabelle","Lotus chocolates","Mars","Cadbury Dairy Milk chocolates Bar","Fabelle tiramisu chocolates","Lindt napolitains assorted pack","Pacari chocolates","Bogatchi"};
		String homeAppliances[] ={"Microwave","Kettle","Refrigerator","Oven","Blender","Coffeemaker","Fan","Toaster","Air Conditioner","Television","Washing Machine","Food Processor","Juicer","Cleaning items","Dishwasher","Furniture","Gas Cooker","Rice cookers","Air Fryer","Computer"};
		
		
		System.out.println("Welcome to "+name);
		System.out.println("***************");
		System.out.println("Available groceries are");
		for (String grocery : groceries){
			System.out.println(grocery);
		}
		System.out.println("***************");
		System.out.println("Available vegetables are");
		for (String vegetable : vegetables){
			System.out.println(vegetable);
		}
		
		System.out.println("***************");
		System.out.println("Available fruits are");
		for (String fruit : fruits){
			System.out.println(fruit);
		}
		
		System.out.println("***************");
		System.out.println("Available perfumes are");
		for (String perfume : perfumes){
			System.out.println(perfume);
		}
		
		System.out.println("***************");
		System.out.println("Available iceCream are");
		for (String ice : iceCream){
			System.out.println(ice);
		}
		
		System.out.println("***************");
		System.out.println("Available cosmetics are");
		for (String cosmetic : cosmetics){
			System.out.println(cosmetic);
		}
		
		System.out.println("***************");
		System.out.println("Available Cool Drinks are");
		for (String coolDrink : coolDrinks){
			System.out.println(coolDrink);
		}
		
		System.out.println("***************");
		System.out.println("Available alcohols are");
		for (String alcohol : alcohols){
			System.out.println(alcohol);
		}
		
		System.out.println("***************");
		System.out.println("Available Milk Products are");
		for (String milkProduct : milkProducts){
			System.out.println(milkProduct);
		}
		
		System.out.println("***************");
		System.out.println("Available snacks are");
		for (String snack : snacks){
			System.out.println(snack);
		}
		
		System.out.println("***************");
		System.out.println("Available chocolates are");
		for (String chocolate : chocolates){
			System.out.println(chocolate);
		}
		
		System.out.println("***************");
		System.out.println("Available Home Appliances are");
		for (String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
		
		System.out.println("***************");
		
		
		
		System.out.println("Main ended");
	}
}