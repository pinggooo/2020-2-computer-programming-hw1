public class DrawingFigure {
    public static void drawFigure(int n) {
        char[] figure = {'/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/', '/',
                '/', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\', '\\',
                '\\', '\\', '\\', '\\'};

        for(int i = 1; i <=n; i++) {
            ChangeIntoStar.changeIntoStar(figure, i);
            System.out.println(figure);
        }
    }
}
