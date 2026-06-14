import java.util.Scanner;
class Solution {
    static void speedCalc(double distance, double time) {
        if(time == 0){
            System.out.println("Time cannot be zero");
            return;
        }
        double speedMps = distance / time;
        double speedKmph = speedMps * (18.0 / 5.0);
        System.out.printf("%.2f%n", speedKmph);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        speedCalc(distance, time);
    }
}
