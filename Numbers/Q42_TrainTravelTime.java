import java.util.Scanner;
class Solution {
    static void trainTime(double speed, double distance) {
        if(speed == 0){
            System.out.println("Train is not moving");
            return;
        }
        double speedInMps = speed * (5.0 / 18.0);
        double time = distance / speedInMps;
        System.out.printf("%.2f%n", time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();
        double distance = sc.nextDouble();
        trainTime(speed, distance);
    }
}
