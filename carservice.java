class Car{
	public static void main(String[] args) {
		 int km = 15000;
	        if (km > 20000) {
	            System.out.println("Needs full service.");
	        } else if (km >= 10000) {
	            System.out.println("Needs semi-service.");
	        } else {
	            System.out.println("Only general checkup needed.");
	        }
	}

}