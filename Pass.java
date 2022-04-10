import java.util.Scanner;

class Pass {
  public static final int password_length = 8;

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("Enter password: ");
    String s = read.nextLine();
    read.close();
    if (is_valid(s))
      System.out.println("valid: " + s);
    else
      System.out.println("not valid");
  }

  public static boolean is_valid(String pass) {
    if (pass.length() < password_length)
      return false;
    int char_count = 0, nb_count = 0;
    for (int i = 0; i < pass.length(); i++) {
      char ch = pass.charAt(i);
      // System.out.println(ch + " char code at: " + (int) ch);
      if (isNumeric(ch))
        nb_count++;
      else if (isLetter(ch))
        char_count++;
    }
    return (char_count >= 2 && nb_count >= 2);
  }

  public static boolean isLetter(char ch) {
    ch = Character.toUpperCase(ch);
    return (ch >= 'A' && ch <= 'Z');
  }

  public static boolean isNumeric(char ch) {
    return (ch >= '0' && ch <= '9');
  }
}
