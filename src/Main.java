public class Main {
    public static void main(String[] args) {
        BmiService Bmi = new BmiService();
        double height = 1.87;
        int mass = 98;
        int index = BmiService.calculate(height, mass);
        System.out.println(index);
    }
}