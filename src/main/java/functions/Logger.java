package functions;

import java.util.function.Consumer;

public class Logger implements Consumer<String> {

	public void accept(String s) {
		System.out.println("The result: " + s);
	}
}
