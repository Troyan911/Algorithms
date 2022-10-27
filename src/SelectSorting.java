import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectSorting {
    public static void main(String[] args) {

        int numOfElements = 10;
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        //fill list with random values
        for (int i = 0; i < numOfElements; i++) {
            list.add(r.nextInt(100));
        }

        //display unsorted list
        System.out.println("Unsorted list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        List<Integer> sortedList = new ArrayList<>();
        //list sorting
        for (int i = 0; i < numOfElements; i++) {
            int minValueIndex = getMinValue(list);
            sortedList.add(list.get(minValueIndex));
            list.remove(minValueIndex);
        }

        //sorted list
        System.out.println("Sorted list");
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }

    static int getMinValue(List<Integer> list) {
        int min = list.get(0);
        int minIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if(min > list.get(i)) {
                min = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

}
