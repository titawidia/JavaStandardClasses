package bagian4;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = {
            1, 6, 23, 16, 31, 8, 9, 13, 9
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 9));
        System.out.println(Arrays.binarySearch(numbers, 11));

        int[] result = Arrays.copyOf(numbers, 5); // menentukan jumlah data yang akan di copy
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
