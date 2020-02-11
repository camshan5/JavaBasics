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
        String noun = console.readLine("Enter a noun:\n=>");
        String adverb = console.readLine("Enter an adverb:\n=>");
        String verb = console.readLine("Enter a verb ending with -ing:\n=>");

        console.printf("Story:\n------\n");
        console.printf("%s is a %s %s.  ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);

    }
}