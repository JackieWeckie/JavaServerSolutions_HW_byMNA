package hw23052025;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {-3, 0, 21, 21, 45, 73, 91, 437, 1099, 2049};
        int[] array2 = {-1, 1, 17, 39, 84, 99, 395, 872, 907, 907};

        System.out.println(Arrays.toString(twoArrays(array1, array2)));
    }

    public static int[] twoArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        int array1Index = 0;
        int array2Index = 0;

        for (int i = 0; i < array3.length; i++) {
            if (array2Index >= array2.length || (array1Index < array1.length
                    && array1[array1Index] <= array2[array2Index])) {
                array3[i] = array1[array1Index++];
            } else {
                array3[i] = array2[array2Index++];
            }
        }

        return array3;
    }
}
