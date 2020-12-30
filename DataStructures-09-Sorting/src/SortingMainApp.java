import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myArray = new int[]{8,2,4,1,3};
        var myBubbleSort = new MyBubbleSort();
        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myArray)));
    }
}
