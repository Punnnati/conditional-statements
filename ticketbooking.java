class Booking {
	public static void main(String[] args) {
		boolean vip = false;
		boolean isWeekend = true;
        if (isWeekend && vip) {
            System.out.println("Ticket Price: ₹500");
        } else if (isWeekend && !vip) {
            System.out.println("Ticket Price: ₹300");
        } else if (!isWeekend && vip) {
            System.out.println("Ticket Price: ₹400");
        } else {
            System.out.println("Ticket Price: ₹200");
        }

	}

}