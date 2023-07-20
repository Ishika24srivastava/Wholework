package assignment21;
import java.util.Arrays;

public class Duplicate {


    public static void main(final String[] args) {

        final int[] a = { 10, 20, 30, 49, 50, 86, 10, 87};
        Arrays.sort(a);// sorting array
       removeDuplicate(a);
    }

    private static void removeDuplicate(final int[] a) {

        final int[] temp = new int[a.length];

        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1];

        for (int i = 0; i < j; i++) {
             a[i] = temp[i];
        }

        for (int i = 0; i < j; i++) {
             System.out.println(temp[i]);
        }
    }
}


