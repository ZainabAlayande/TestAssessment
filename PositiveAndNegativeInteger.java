import java.util.Arrays;

public class PositiveAndNegativeInteger {

    public static void main(String[] args) {

        int[] array = {-1, 10, -9, -4, -6, 20, 5, 0, -2, 9};
        System.out.println(Arrays.toString(reArrangeValue(array)));

    }
    
    public static int[] reArrangeValue(int[] array) {
        int leftCounter = 0;
        int temp = 0;
        int currentValue = 0;
        int currentIndex;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                currentValue = array[i];
                currentIndex = i;
                temp = array[leftCounter];
                array[leftCounter] = currentValue;
                array[currentIndex] = temp;
                leftCounter++;
            }
        }
        return array;
    }
}
