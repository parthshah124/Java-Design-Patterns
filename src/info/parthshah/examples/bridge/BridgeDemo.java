package info.parthshah.examples.bridge;

public class BridgeDemo {
    public static void main(String args[]){
        Movie movie = new Movie("Avengers: Endgame", "2019", "3 hours");

        Formatter printFormatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(printFormatter));
        System.out.println(moviePrinter.print(htmlFormatter));
    }
}
