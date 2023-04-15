import java.util.Arrays;

public class ProductOfElement {

    public static void main(String[] args) {

        int[] array = {4, 2, 1, 5, 0};
        System.out.println(Arrays.toString(getProduct(array)));

    }

    public static int[] getProduct(int[] array) {
        int product = 1;
        int[] arrayToReturn = new int[array.length];

        int currentIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == currentIndex)
                    continue;

                product = product * array[j];
            }
            arrayToReturn[currentIndex] = product;
            currentIndex++;
            product = 1;
        }

        return arrayToReturn;
    }
}
