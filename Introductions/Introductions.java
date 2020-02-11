import java.io.Console;

public class Introductions {

    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!
        String firstName = console.readLine("What is your name?\n=>");
        console.printf("Hello, my name is %s\n", firstName);
    }
}