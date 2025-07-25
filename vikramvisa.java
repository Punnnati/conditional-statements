class Visa {
	public static void main(String[] args) {
        int age = 45;
		boolean hasPassport = false;
        if (age >= 18 && hasPassport) {
            System.out.println("Visa application accepted.");
        } else if (age >= 18 && !hasPassport) {
            System.out.println("Apply for passport first.");
        } else {
            System.out.println("Visa not allowed.");
        }
	}

}