class Delivery{
	public static void main(String[] args) {
	    int mode = 1; 
	    boolean storeOpen = true, deliveryAvailable = true, tableAvailable = false;
           int deliveryDistance = 8;
           switch (mode) {
               case 1:
                   if (storeOpen) {
                    System.out.println("Pickup allowed");
                } else {
                    System.out.println("Store closed");
                }
                break;
            case 2:
                if (deliveryDistance <= 10 && deliveryAvailable) {
                    System.out.println("Delivery allowed");
                } else {
                    System.out.println("Not deliverable");
                }
                break;
            case 3:
                if (tableAvailable) {
                    System.out.println("Table booked");
                } else {
                    System.out.println("No tables available");
                }
                break;
        }
	}

}