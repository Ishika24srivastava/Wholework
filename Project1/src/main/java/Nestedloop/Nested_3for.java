package Nestedloop;

public class Nested_3for {
	public static void main(String[] args) {

        for (int i = 1; i <= 2; i++) {
            System.out.println("\nValue of i: " + i);

            for (int j = 1; j <= 2; j++) {
                System.out.println("  Value of j: " + j);
                for (int k = 1; k < 2; k++) {
                    System.out.println("   Value of k: " + k);
                }
            }
        }
    }
}

