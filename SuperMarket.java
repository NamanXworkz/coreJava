class SuperMarket{
	public static void main(String[] market){
		System.out.println("Main started");
		
		String name = "AK Super Market";
		String groceries[]={"urad dal", "Wheat", "Rice", "Sugar", "Egg", "Bread", "Ragi", "salt", "pepper", "Mashroom", "Chan dal","pasta","meat","chickpea","dry ginger"};
		String vegetables[]={"Carrot", "Beans", "Ladie's fingers", "Onion", "Spinach", "Beetroot", "Black eyed beans", "broccoli", "dill", "endive"};
		String fruits[]={"Apple", "banana", "cherry", "fig", "blueberry", "guava", "grapes", "kiwi", "watermelon", "pineapple"};
		String perfume[] ={"Wild Stone","Embark","Jaguar","Nautica","Davidoff","Dior","Calvin Klein","Dior Sauvage Eau de Parfum","Creed Aventus","Tom Ford Oud Wood","Bleu de Chanel","Acqua di Giò  Giorgio Armani","Yves Saint Laurent La Nuit de L'Homme","Paco Rabanne","Viktor & Rolf Spicebomb"};
		String iceCream[] ={"Vanilla ice cream","Baskin-Robbins","Chocolate chip cookie dough ice cream","Chocolate ice cream","Cookies and cream","Butter pecan","Chocolate","Cold Stone Creamery","Häagen-Dazs","Natural Ice Cream","Green tea ice cream","Beckon Ice Cream","Banana ice cream","Strawberry ice cream","Mint chocolate chip"};
		String cosmetic[] ={"Mascara","Eyeshadow","Eyeliner","Foundation","Concealer","Blush","Makeup brushes","Lipstick","Compact powders","Primer","Setting Spray","Kajal","Highlighter","Contour","Bronzer"};
		String coolDrink[] ={"Fanta","Campa Cola","Coca-Cola","Lemon","Canada Dry","Eskimo soft drinks","Ginger ale","RC Cola","J2O","Minute Maid","Mirinda","Energy drink","Mountain Dew","Sprite","Pepsi"};
		String alcohol[] ={"Absolut","Bacardi","Jack Daniel","Hennessy","Smirnoff","Crown Royal","Grey Goose","Chivas Regal","Captain Morgan","Johnnie Walker","Jägermeister","Jim Beam","Patrón","Baileys","Ballantine"};
		String milkProducts[] ={"Milk","Milk Powder","Cream","Whey","Butter","Fermented","Yogurt","Cheese","Custard","Frozen"};
		String snacks[] ={"tortilla chips","corn chips","potato chips","extruded products","pork rinds","pretzels","popcorn","nuts","seeds","Bhel Puri","Samosa"};
		String chocolate[] ={"Ferrero Rocher","Amul","Cadbury","Hershey chocolates","Toblerone Chocolate","Ghirardelli","Lindt","Fabelle","Lotus chocolates","Mars","Cadbury Dairy Milk Chocolate Bar","Fabelle tiramisu chocolate","Lindt napolitains assorted pack","Pacari Chocolates","Bogatchi"};
		String homeAppliances[] ={"Microwave","Kettle","Refrigerator","Oven","Blender","Coffeemaker","Fan","Toaster","Air Conditioner","Television","Washing Machine","Food Processor","Juicer","Cleaning items","Dishwasher","Furniture","Gas Cooker","Rice cookers","Air Fryer","Computer"};
		
		
		System.out.println("Welcome to "+name);
		System.out.println("***************");
		System.out.println("Available groceries are \n"+groceries[0]+"\n"+groceries[1]+"\n"+groceries[2]+"\n"+groceries[3]+"\n"+groceries[4]+"\n"+groceries[5]+"\n"+groceries[6]+"\n"+groceries[7]+"\n"+groceries[8]+"\n"+groceries[9]+"\n"+groceries[10]+"\n"+groceries[11]+"\n"+groceries[12]+"\n"+groceries[13]+"\n"+groceries[14]);
		System.out.println("***************");
		System.out.println("Available vegetables are \n"+vegetables[0]+"\n"+vegetables[1]+"\n"+vegetables[2]+"\n"+vegetables[3]+"\n"+vegetables[4]+"\n"+vegetables[5]+"\n"+vegetables[6]+"\n"+vegetables[7]+"\n"+vegetables[8]+"\n"+vegetables[9]);
		System.out.println("***************");
		System.out.println("Available fruits are \n"+fruits[0]+"\n"+fruits[1]+"\n"+fruits[2]+"\n"+fruits[3]+"\n"+fruits[4]+"\n"+fruits[5]+"\n"+fruits[6]+"\n"+fruits[7]+"\n"+fruits[8]+"\n"+fruits[9]);
		System.out.println("***************");
		System.out.println("Available perfume are \n"+perfume[0]+"\n"+perfume[1]+"\n"+perfume[2]+"\n"+perfume[3]+"\n"+perfume[4]+"\n"+perfume[5]+"\n"+perfume[6]+"\n"+perfume[7]+"\n"+perfume[8]+"\n"+perfume[9]+"\n"+perfume[10]+"\n"+perfume[11]);
		System.out.println("***************");
		System.out.println("Available iceCream are \n"+iceCream[0]+"\n"+iceCream[1]+"\n"+iceCream[2]+"\n"+iceCream[3]+"\n"+iceCream[4]+"\n"+iceCream[5]+"\n"+iceCream[6]+"\n"+iceCream[7]+"\n"+iceCream[8]+"\n"+iceCream[9]);
		System.out.println("***************");
		System.out.println("Available cosmetic are \n"+cosmetic[0]+"\n"+cosmetic[1]+"\n"+cosmetic[2]+"\n"+cosmetic[3]+"\n"+cosmetic[4]+"\n"+cosmetic[5]+"\n"+cosmetic[6]+"\n"+cosmetic[7]+"\n"+cosmetic[8]+"\n"+cosmetic[9]);
		System.out.println("***************");
		System.out.println("Available coolDrink are \n"+coolDrink[0]+"\n"+coolDrink[1]+"\n"+coolDrink[2]+"\n"+coolDrink[3]+"\n"+coolDrink[4]+"\n"+coolDrink[5]+"\n"+coolDrink[6]+"\n"+coolDrink[7]+"\n"+coolDrink[8]+"\n"+coolDrink[9]);
		System.out.println("***************");
		System.out.println("Available alcohol are \n"+alcohol[0]+"\n"+alcohol[1]+"\n"+alcohol[2]+"\n"+alcohol[3]+"\n"+alcohol[4]+"\n"+alcohol[5]+"\n"+alcohol[6]+"\n"+alcohol[7]+"\n"+alcohol[8]+"\n"+alcohol[9]);
		System.out.println("***************");
		System.out.println("Available milkProducts are \n"+milkProducts[0]+"\n"+milkProducts[1]+"\n"+milkProducts[2]+"\n"+milkProducts[3]+"\n"+milkProducts[4]+"\n"+milkProducts[5]+"\n"+milkProducts[6]+"\n"+milkProducts[7]+"\n"+milkProducts[8]+"\n"+milkProducts[9]);
		System.out.println("***************");
		System.out.println("Available snacks are \n"+snacks[0]+"\n"+snacks[1]+"\n"+snacks[2]+"\n"+snacks[3]+"\n"+snacks[4]+"\n"+snacks[5]+"\n"+snacks[6]+"\n"+snacks[7]+"\n"+snacks[8]+"\n"+snacks[9]);
		System.out.println("***************");
		System.out.println("Available chocolate are \n"+chocolate[0]+"\n"+chocolate[1]+"\n"+chocolate[2]+"\n"+chocolate[3]+"\n"+chocolate[4]+"\n"+chocolate[5]+"\n"+chocolate[6]+"\n"+chocolate[7]+"\n"+chocolate[8]+"\n"+chocolate[9]);
		System.out.println("***************");
		System.out.println("Available home Appliances are \n"+homeAppliances[0]+"\n"+homeAppliances[1]+"\n"+homeAppliances[2]+"\n"+homeAppliances[3]+"\n"+homeAppliances[4]+"\n"+homeAppliances[5]+"\n"+homeAppliances[6]+"\n"+homeAppliances[7]+"\n"+homeAppliances[8]+"\n"+homeAppliances[9]);
		System.out.println("***************");
		
		
		System.out.println("Main ended");
	}
}