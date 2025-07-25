class travelVisa{
public static void main(String[]args){
int age=23;
boolean hasPassport = true;
boolean hasNoCriminalRecord = true;
if(age>=18 && hasPassport == true && hasNoCriminalRecord == true){
System.out.println("Eligible for visa");
}
else if(age>=18 && hasPassport == false && hasNoCriminalRecord == true){
System.out.println("Apply for passport first");
}
else if (age<18 || hasNoCriminalRecord == false){
System.out.println(" Not Eligible");
}
}
}