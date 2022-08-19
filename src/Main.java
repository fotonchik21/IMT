public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println(service.calculate((float) 89.9, (float) 1.8));
    }
}
