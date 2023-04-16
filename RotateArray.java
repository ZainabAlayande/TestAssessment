import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] array = {8, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(Arrays.toString(rotateFirstAndLastElement(array)));

    }

    public static int[] rotateFirstAndLastElement(int[] array) {
        // TODO: 4/16/2023 [1, 2, 3, 4, 5]
        // TODO: 4/16/2023 [5, 1, 2, 3, 4]

        int[] newArray = new int[array.length];
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        newArray[0] = lastElement;
        newArray[1] = firstElement;

        int index = 1;
        for (int i = 2; i < array.length; i++) {
            newArray[i] = array[index];
            index++;

        }
        return newArray;
    }
}
