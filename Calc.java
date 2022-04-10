import java.util.Scanner;

class Calc {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    input.close();
    System.out.println("Addition: " + (firstNum + secondNum));
    System.out.println("Multipication: " + (firstNum * secondNum));
    System.out.println("Subtraction: " + (firstNum - secondNum));
    System.out.println("Divide: " + (firstNum / secondNum));
    System.out.println("Remainder: " + (firstNum % secondNum));
  }
}
