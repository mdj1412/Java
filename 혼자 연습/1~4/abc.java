class abc {
	public static void main(String[] args) {

	Typetester test = new Typetester();
	test.printType(1.0f + 2.1f);
	}


}


class Typetester {
	void printType(byte x) {
		System.out.println(x + " is an byte");
	}

	void printType(int x) {
		System.out.println(x + " is an int");
	}

	void printType(float x) {
		System.out.println(x + " is an float");
	}

	void printType(double x) {
		System.out.println(x + " is an double");
	}

	void printType(char x) {
		System.out.println(x + " is an char");
	}
}