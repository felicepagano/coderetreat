package it.fpagano.coderetreat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String html = """
            <html>
                <body>
                </body?
            </html>
        """;

        int i = 0;

        boolean b = switch(i) {
            case 1: yield true;
            default: yield false;
        };
        System.out.println(b);
        System.out.println(html);
    }
    
}
