import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int HEIGHT = 320;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;

    // Ball 1
    int ball1HorizontalDistance = 0;
    int ball1VerticalDistance = HEIGHT / 5;

    // Ball 2
    int ball2HorizontalDistance = 0;
    int ball2VerticalDistance = 2 * ball1VerticalDistance;

    // Ball 3
    int ball3HorizontalDistance = 0;
    int ball3VerticalDistance = 3 * ball1VerticalDistance;

    // Ball 2
    int ball4HorizontalDistance = 0;
    int ball4VerticalDistance = 4 * ball1VerticalDistance;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {

        ball1HorizontalDistance += 1;
        ball2HorizontalDistance += 2;
        ball3HorizontalDistance += 3;
        ball4HorizontalDistance += 4;

        ellipse(ball1HorizontalDistance, ball1VerticalDistance, DIAMETER, DIAMETER);
        ellipse(ball2HorizontalDistance, ball2VerticalDistance, DIAMETER, DIAMETER);
        ellipse(ball3HorizontalDistance, ball3VerticalDistance, DIAMETER, DIAMETER);
        ellipse(ball4HorizontalDistance, ball4VerticalDistance, DIAMETER, DIAMETER);
    }
}
