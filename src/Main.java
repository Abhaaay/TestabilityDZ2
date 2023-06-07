
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massInKg = 85;
        double heightInMeters = 1.87;
        double index = service.calculate(massInKg, heightInMeters);
        int roundedIndex = (int) Math.round(index); // Округляем индекс массы тела до ближайшего целого числа

        System.out.println(" Индекс массы тела: " + roundedIndex);
    }
}
