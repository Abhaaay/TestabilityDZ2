public class BmiService {
    public double calculate(int massInKg, double heightInMeters) {
        double index = massInKg / (heightInMeters * heightInMeters);
        return index;
    }
}