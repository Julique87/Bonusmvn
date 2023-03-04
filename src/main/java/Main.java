public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(5_000, false);
        System.out.println(bonus);
    }
}
