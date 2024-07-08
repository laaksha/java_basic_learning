public class Pen {

    static boolean clicked;
    private static boolean unclicked;
    String type = "gel";
    String color = "blue";
    int point = 10;

    public static void click() {
        clicked = true;

    }

    public static void unclick() {
        unclicked = false;
    }
    
}
