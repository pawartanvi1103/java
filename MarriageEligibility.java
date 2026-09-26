import java.util.Scanner;
public class MarriageEligibility{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter persons age :");
  int age = sc.nextInt();

  System.out.println("Enetr your gender (M/F) :");
  char gender = sc.next().charAt(0);

  System.out.println("Enter your nationality i or I for Indian :");
  char nationality = sc.next().charAt(0);

  if(nationality != 'i' && nationality != 'I'){
     System.out.println("You are not an Indian citizen, cannot get married in India.");
}
  else if((gender == 'm' || gender == 'M') && age >= 21){
     System.out.println("Eligible to get married in india ");
}
  else if((gender == 'f' || gender == 'F') && age >=18){
     System.out.println(" Eligible to get married in india");
}
  else {
     System.out.println("YOu are not eligible");
}
}
}