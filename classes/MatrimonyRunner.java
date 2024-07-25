class MatrimonyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in MatrimonyRunner");
		Matrimony matrimony=new Matrimony();
		String name=matrimony.name;
		int age=matrimony.age;
		char gender=matrimony.gender;
		System.out.println("Matrimony username:"+name);
		System.out.println("Matrimony userage:"+age);
		System.out.println("Matrimony gender:"+gender);
		
		matrimony.name="Jeevitha";
		matrimony.age=23;
		matrimony.gender='F';
		System.out.println("Matrimony updated username:"+matrimony.name);
		System.out.println("Matrimony updated userage:"+matrimony.age);
		System.out.println("Matrimony updated gender:"+matrimony.gender);
		System.out.println("========");
		
		Application application=new Application();
		application.name="Innovative";
		application.applicationId=1234;
		application.working=true;
		System.out.println("Application updated name:"+application.name);
		System.out.println("Application updated id:"+application.application_id);
		System.out.println("Application updated working:"+application.working);
		System.out.println("========");
		
		Fruit fruit=new Fruit();
		fruit.name="Mango";
		fruit.quantity=100;
		fruit.price=200;
		System.out.println("Fruit updated name:"+fruit.name);
		System.out.println("Fruit updated quantity:"+fruit.quantity);
		System.out.println("Fruit updated price:"+fruit.price);
		System.out.println("========");
		
		Juice juice=new Juice();
		juice.name="Pineapple";
		juice.price=50;
		juice.quantity=250;
		System.out.println("Juice updated name:"+juice.name);
		System.out.println("Juice updated price:"+juice.price);
		System.out.println("Juice updated quantity:"+juice.quantity);
		
		Place place=new Place();
		place.name="Cubbon Park";
		place.pincode=560002;
		place.address="Bangalore";
		System.out.println("place updated name:"+place.name);
		System.out.println("place updated pincode:"+place.pincode);
		System.out.println("place updated address:"+place.address);
		
		Candy candy=new Candy();
		candy.name="Melody";
		candy.price=5;
		candy.flavour="Chocolate";
		System.out.println("candy updated name:"+candy.name);
		System.out.println("candy updated price:"+candy.price);
		System.out.println("candy updated flavour:"+candy.flavour);
		
		Medicine medicine=new Medicine();
		medicine.name="Dolo";
		medicine.price=10;
		medicine.quantity=1;
		System.out.println("medicine updated name:"+medicine.name);
		System.out.println("medicine updated price:"+medicine.price);
		System.out.println("medicine updated flavour:"+medicine.quantity);
		
		Food food=new Food();
		food.name="Dal";
		food.price=100;
		food.quantity=1;
		System.out.println("food updated name:"+food.name);
		System.out.println("food updated price:"+food.price);
		System.out.println("food updated flavour:"+food.quantity);
		System.out.println("End main in MatrimonyRunner");
	}
}