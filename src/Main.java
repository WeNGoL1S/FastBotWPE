public class Main {

    public static boolean AlwaysOT;

    public static void main(String[] args) {

        System.out.print(Main.AlwaysOT);

        Background background = new Background();
        Window window = new Window(background);

        window.setUp();
        window.setButtons();
    }
}