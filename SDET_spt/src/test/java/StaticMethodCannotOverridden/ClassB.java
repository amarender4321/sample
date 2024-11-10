package StaticMethodCannotOverridden;

public class ClassB extends ClassA{

	// so, we can not over ride static method in to child class of parent class method
	public  void sample() {
		
		System.out.println("sample-----ClassA");
		
	}

}
