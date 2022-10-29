import java.lang.Math;

public class Test1 {
  String name;
  int grade1, grade2, grade3;
  double grade4, grade5, grade6;

  public static void main(String[] args) {
    String name = args[0];
    int grade1 = Integer.parseInt(args[1]);
    int grade2 = Integer.parseInt(args[2]);
    int grade3 = Integer.parseInt(args[3]);
    double grade4 = Double.parseDouble(args[4]);
    double grade5 = Double.parseDouble(args[5]);
    double grade6 = Double.parseDouble(args[6]);

    Test1 test = new Test1( name, grade1, grade2, grade3, grade4, grade5, grade6 );

    tot(grade1, grade2, grade3);
    m1(grade1);
    System.out.println(avg(grade1, grade2, grade3));
    avgdecimal(grade4, grade5, grade6);
    test.m2();
  };

  Test1( String name, int grade1, int grade2, int grade3, double grade4, double grade5, double grade6 ) {
    this.name = name;
    this.grade1 = grade1;
    this.grade2 = grade2;
    this.grade3 = grade3;
    this.grade4 = grade4;
    this.grade5 = grade5;
    this.grade6 = grade6;
  }

  // method 1
  public static void tot(int grade1, int grade2, int grade3) {
    int sum = grade1 + grade2 + grade3;
    System.out.println(sum);
  }

  // method 2
  public static void m1(int grade1) {
    System.out.println(Math.pow(grade1, grade1));
  }

  // method 3
  public static int avg(int grade1, int grade2, int grade3) {
    int avarage = (grade1 + grade2 + grade3) / 3;
    return avarage;
  }

  // method 4
  public static void avgdecimal(double grade4, double grade5, double grade6) {
    double avarage = (grade4 + grade5 + grade6) / 3;
    System.out.println(avarage);
  }

  // method 5
  public void m2() {
    System.out.println("Thank u for your first try in Java");
  }
}
