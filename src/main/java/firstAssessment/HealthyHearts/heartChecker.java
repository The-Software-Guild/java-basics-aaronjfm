package firstAssessment.HealthyHearts;

import java.util.Scanner;

public class heartChecker {

    public static void main(String[] args) {
        checkHeart();
    }

    public static void checkHeart(){
        int HeartRate = 220;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = sc.nextInt();
        int maxHeartRate = HeartRate - userAge;
        int lowHeartRateRange = (maxHeartRate/100)*50;
        int highHeartRateRange = (maxHeartRate/100)*85;
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + lowHeartRateRange + " - " + highHeartRateRange + " beats per minute");
    }

}
