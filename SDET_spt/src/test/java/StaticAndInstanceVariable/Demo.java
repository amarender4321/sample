package StaticAndInstanceVariable;

public class Demo {

	public static void main(String[] args) {
		
	System.out.println(Car.wheels);
	
	Car honda = new Car();
	
	honda.model="Amaze";
    honda.color="Grey";
    honda.price=800000;
    
    Car swift= new Car();
    swift.model="VDI";
    swift.color="Red";
    swift.price=90000;
	}

}
