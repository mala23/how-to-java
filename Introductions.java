import java.io.Console;

public class Introductions {

  public static void main(String[] args) {
    Console console = System.console();
    String firstName = "Colin";
    // Variable names in Java are defined in camel case
    console.printf("Hello, my name is %s\n", firstName);
    // printf or print formated allows escape sequences and variables in
    // strings that are then formatted before output
    console.printf("%s is learning to write Java\n", firstName);
  }
}
