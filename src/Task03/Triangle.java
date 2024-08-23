package Task03;

public class Triangle implements Shape {
    @Override
    public void draw() {
        int height = 5;
        int i;
        for (i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");
            }
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

