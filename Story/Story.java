import java.io.Console;

// clear && javac Story/Story.java && java Story/Story.java

public class Story {
    public static void main(String[] args) {
        Console console = System.console();

        /* Some Terms:
        *  noun - Person, place or thing
        *  verb - An action
        *  adjective - A description used to modify or describe a noun
        * */

        String name = console.readLine("Enter your name:\n=>");
        String adjective = console.readLine("Enter an adjective:\n=>");

        console.printf("%s is very %s\n", name, adjective);

    }
}