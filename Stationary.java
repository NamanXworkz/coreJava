class Stationary{
	public static void main(String[] itm){
		System.out.println("Main started");
		
		String name = "Signature Store";
		
		String items[] = {"Paper","Scissors","Stapler","Folder","Marker","Paperclips Pen","Highlighter","Highlighters","Notebook","Pencils","Sticky Notes","Calculator","Desk accessories","Eraser","Envelopes"};
		
		System.out.println("The Shop Name is "+name);
		System.out.println("***************");
		System.out.println("Available Items are");


		//for (String item : items){
		//	System.out.println(item);
	//	}
	for (int ref=0 ; ref<items.length;ref++){
		String value= items[ref];
		System.out.println(value);
	}
		System.out.println("Total Number Of items--"+items.length);

		System.out.println("***************");
		
		System.out.println("Main ended");
		
	}
}