class Test{
	public static void main(String[] args) {
		String questionType = "Code";
        String selectedOption = null;
        int passed = 5, total = 5, wordCount = 120;
        switch (questionType) {
            case "MCQ":
                if (selectedOption != null) {
                    System.out.println("Submitted");
                } else {
                    System.out.println("Choose an option");
                }
                break;
            case "Code":
                if (passed == total) {
                    System.out.println("Auto-submitted");
                } else {
                    System.out.println("Feedback shown");
                }
                break;
            case "Essay":
                if (wordCount >= 150) {
                    System.out.println("Submission allowed");
                } else {
                    System.out.println("Write more");
                }
                break;
        }
	}

}