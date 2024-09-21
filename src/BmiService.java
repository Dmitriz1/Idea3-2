public class BmiService {
    public static int calculate(double height, int mass) {
        return (int) (mass / (height * height));
    }
}
