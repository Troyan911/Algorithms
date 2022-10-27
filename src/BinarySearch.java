import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {

        //generate rand number up to 100
        Random r = new Random();
        int rand = r.nextInt(150);
        System.out.println("Rand: " + rand + "\n");

        //fill array with numbers from 1 to 99
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int start = 0;
        int end = arr.length - 1;
        int middle;

        boolean found = false;
        int iteration = 0;

        while (!found) {
            if (rand < arr[arr.length - 1]) {
                iteration++;

                middle = start + ((end - start) / 2);

                if (rand > middle) {
                    start = middle;
                } else if (rand < middle) {
                    end = middle;
                } else if (rand == middle) {
                    found = true;
                    System.out.println("Found! " + middle);
                }

                System.out.println("Iteration: " + iteration);
                System.out.println("Start: " + start);
                System.out.println("End: " + end);
                System.out.println("------------------------------");
            }
            else {
                System.out.println(rand + " not found in array with max value " + arr[arr.length-1]);
                break;
            }
        }
    }

}
