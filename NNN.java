import java.util.Scanner;

class NNN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    input.close();
    System.out.println(num + "+" + Integer.toString(num) + Integer.toString(num) + "+" + Integer.toString(num)
        + Integer.toString(num) + Integer.toString(num) + "= " + ((num) + (num * 11)
            + (num * 111)));
    System.out.printf("%d+%d%d+%d%d%d=" + (num + num * 11 + num * 111), num, num, num, num, num, num);
  }
}
