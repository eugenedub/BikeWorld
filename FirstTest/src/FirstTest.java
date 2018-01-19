
public class FirstTest {

	public static void main(String[] args) {
		System.out.println("waar gaat dit allemaal naartoe?");
		// Testclasse zonder parameter
		System.out.println("------------Test zonder parameter");
		TestClasse test1 = new TestClasse();
		System.out.println("Testfloat: " + test1.testFloat);
		System.out.println("TestInteger: " + test1.testInteger);

		System.out.println("------------Test karakter parameter");
		TestClasse test2 = new TestClasse('a');
		System.out.println("Testfloat: " + test2.testFloat);
		System.out.println("TestInteger: " + test2.testInteger);

	}

}
