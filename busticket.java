class Ticket {
	public static void main(String[] args) {
		int distance = 120;
        boolean isWeekend = true;
        if (distance < 50) {
            System.out.println("Fare: ₹50");
        } else if (distance <= 100) {
            System.out.println("Fare: ₹100");
        } else if (isWeekend) {
            System.out.println("Fare: ₹300");
        } else {
            System.out.println("Fare: ₹200");
        }

	}

}