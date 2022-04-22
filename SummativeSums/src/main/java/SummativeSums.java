public class SummativeSums {

    static int[] test1 = new int[]{ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    static int[] test2 = new int[]{ 999, -60, -77, 14, 160, 301 };
    static int[] test3 = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };


    public static void main(String[] args) {
        System.out.println(startCalculation(test1));
        System.out.println(startCalculation(test2));
        System.out.println(startCalculation(test3));
    }

    public static int startCalculation(int[] arrayToAdd){
        int result = 0;
        for(int i =0; i<arrayToAdd.length;i++){
            result += arrayToAdd[i];
        }
        return result;
    }
}
