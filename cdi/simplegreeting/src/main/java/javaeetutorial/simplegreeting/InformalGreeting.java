package javaeetutorial.simplegreeting;

@Informal
public class InformalGreeting extends Greeting {

	@Override
	public String greet(String name) {
		if (name == null || name.trim().isEmpty()) {
			return "Hello, Stranger!";
		}
		return super.greet(name);
	}
}
