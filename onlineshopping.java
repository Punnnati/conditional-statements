class Online {
	public static void main(String[] args) {
		double amount = 7000;
        boolean isMember = true;
        if (amount >= 10000 && isMember) {
            System.out.println("30% Discount");
        } else if (amount >= 5000 && isMember) {
            System.out.println("20% Discount");
        } else {
            System.out.println("5% Discount");
        }
	}
  }