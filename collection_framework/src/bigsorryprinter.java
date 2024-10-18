public class bigsorryprinter {
        public static void main(String[] args) {
            printBigSorrySquare();
        }

        public static void printBigSorrySquare() {
            int size = 7; // Adjust the size as needed

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size * 7; j++) {
                    if (i == 0 || i == size - 1 || j % 7 == 0 || j % 7 == 6) {
                        System.out.print("S");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size * 7; j++) {
                    if (i == size / 2 && j % 7 == 2) {
                        System.out.print("O");
                    } else if ((i == 0 || i == size - 1) && j % 7 == 0) {
                        System.out.print("O");
                    } else if (i > 0 && i < size - 1 && (j % 7 == 0 || j % 7 == 6)) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size * 7; j++) {
                    if ((i == 0 || i == size - 1 || i == size / 2) && j % 7 != 0) {
                        System.out.print("R");
                    } else if (j % 7 == 0 && !(i == 0 || i == size - 1 || i == size / 2)) {
                        System.out.print("R");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size * 7; j++) {
                    if (i == 0 || i == size - 1 || j % 7 == 0 || (i == size / 2 && j % 7 == 6)) {
                        System.out.print("Y");
                    } else if (i > 0 && i < size / 2 && j % 7 == 2) {
                        System.out.print("Y");
                    } else if (i > size / 2 && i < size - 1 && j % 7 == 6) {
                        System.out.print("Y");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


}


