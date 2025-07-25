class Banking{
	public static void main(String[] args) {
		int choice = 2;
        double balance = 10000, withdrawAmount = 5000;
        boolean receiverExists = true;
        switch (choice) {
            case 1:
                if (balance >= withdrawAmount && withdrawAmount > 0) {
                    System.out.println("Withdrawal allowed");
                } else {
                    System.out.println("Insufficient funds");
                }
                break;
            case 2:
                if (withdrawAmount > 0) {
                    System.out.println("Deposit successful");
                }
                break;
            case 3:
                if (withdrawAmount <= balance && receiverExists) {
                    System.out.println("Transfer successful");
                } else {
                    System.out.println("Transfer failed");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

	}

}