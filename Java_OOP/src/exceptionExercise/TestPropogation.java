package exceptionExercise;

public class TestPropogation {
	public void first() throws ExampleException {
		try {
			second();
		} catch (ExampleException e) {

			ExampleException e1 = new ExampleException();
			throw e1;

		}

	}

	public void second() throws ExampleException {
		ExampleException e = new ExampleException();
		int y = 4;
		if (y == 4) {
			throw e;

		}

	}

	public static void main(String[] args) throws ExampleException {
		TestPropogation t = new TestPropogation();
		t.first();
	}

}
