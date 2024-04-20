public class Calculates {
	public static void main (String[] args) {
		int numberOne  = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);
		System.out.println("sum of two number " + (numberOne + numberTwo));
		System.out.println("difference of two number " + (numberOne - numberTwo));
		System.out.println("product  of two number " + (numberOne * numberTwo));
		System.out.println("division of two number " + (numberOne / numberTwo));
	}
}
