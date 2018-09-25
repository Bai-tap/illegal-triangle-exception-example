import java.util.Scanner;

public class IlligalTriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Tam giác có 3 cạnh: x, y, z
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter z: ");
        int z = scanner.nextInt();

        IlligalTriangleException illigalTriangleException = new IlligalTriangleException();
        illigalTriangleException.check(x, y, z);
    }

    private void check(int x, int y, int z) throws Exception {
        try {
            if (x < 0 || y < 0 || z < 0) {
                throw new Exception();
            } else {
                if (x + y < z || x + z < y || y + z < x) {
                    throw new Exception();
                } else {
                    System.out.println("Triangle is oke");
                }
            }
        } catch (Exception e) {
            System.err.println("try it again boy");
        }
    }
}
