class Internet{
	public static void main(String[] args) {
		 String plan = "Standard";
	        int usage = 1100;
	        if (plan.equals("Basic") && usage > 500) {
	            System.out.println("Suggest: Premium");
	        } else if (plan.equals("Standard") && usage > 1000) {
	            System.out.println("Suggest: Ultra");
	        } else {
	            System.out.println("Continue current plan");
	        }
	}

}