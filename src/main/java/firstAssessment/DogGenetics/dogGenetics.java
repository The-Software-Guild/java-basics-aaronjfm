package firstAssessment.DogGenetics;

import java.util.*;
public class dogGenetics {

    public static void main(String[] args) {
        displayOutput();
    }

    static int totalPercentage = 100;
    static String[] dogBreeds = {"Dalmation", "Golden Retriever", "British Bulldog", "Pug", "French Bulldog", "Poodle", "Dachshund", "Boxer", "Beagle", "Labrador","German Shepherd", "Boxer", "Husky", "Rottweiler", "Shih Tzu"};

    public static void displayOutput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dogs name?");
        String dogName = sc.nextLine();
        System.out.println(dogName + " is:");

        for(int i = 0;i<4;i++){
            System.out.println(percentageGenerator() + "% " +dogBreedGenerator());
        }
        System.out.println(totalPercentage + "% " +dogBreedGenerator());
    }

    public static String dogBreedGenerator(){
        Random generator = new Random();
        int randomIndex = generator.nextInt(dogBreeds.length);
        String chosenDog = dogBreeds[randomIndex];

        // Remove selected dog from array
        String[] anotherArray = new String[dogBreeds.length - 1];
        for (int i = 0, k = 0; i < dogBreeds.length; i++) {
            if (i == randomIndex) {
                continue;
            }
            anotherArray[k++] = dogBreeds[i];
        }

        dogBreeds = anotherArray;
        return chosenDog;
    }

    public static int percentageGenerator(){
         int result =  (int) (Math.random() * (totalPercentage - 1)) + 1;
         totalPercentage = totalPercentage - result;
         return result;
    }
}
