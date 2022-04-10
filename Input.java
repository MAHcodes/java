import java.util.Scanner;

class Input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.println("Your first number is: " + firstNum + "\nYour second number is: " + secondNum);
    input.close();
  }
}
