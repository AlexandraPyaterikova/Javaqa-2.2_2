public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(1.62F, 64F);
        System.out.println(bmi);
    }
}