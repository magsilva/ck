package ClassCohesion;

class OneVisibleMethod {
	private static int a = 10;

	public void m1() { a = 10; }

	private void m2() { a = 20; }
}
