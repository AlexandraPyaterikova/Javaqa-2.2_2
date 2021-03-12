public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(1.62 F, 64 F);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
