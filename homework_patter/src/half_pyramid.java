public class half_pyramid {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Add spaces before numbers
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }


}
