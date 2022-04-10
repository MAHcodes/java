import java.util.Scanner;

class Multi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any number: ");
    int num = input.nextInt();
    input.close();
    for (int i = 0; i <= 10; i++) {
      System.out.println(num + "x" + i + ": " + num * i);
    }
  }
}
