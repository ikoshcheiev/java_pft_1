public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");
  }

  private static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }
}