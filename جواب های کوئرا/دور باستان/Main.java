import java.util.Scanner;

public class Main {
    private static final int MAX_SIZE = 1000000;
    private static int[] rahHalHa = new int[MAX_SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        String masir = scanner.nextLine();
        if (masir.length() != n) {
            System.exit(-1);
        }

        for (int i = 0; i < n; i++) {
            rahHalHa[i] = -1;
        }

        game(masir, 0);
        System.out.println(rahHalHa[0]);

        scanner.close();
    }

    private static void game(String path, int index) {
        if (index == path.length()) {
            return;
        }

        if (rahHalHa[index] != -1) {
            return;
        }

        char currentChar = path.charAt(index);
        if (currentChar == 'K') {
            rahHalHa[index] = 1;
            return;
        }

        if (currentChar == 'T') {
            rahHalHa[index] = 0;
            return;
        }

        if (currentChar == '.' || currentChar == 'B') {
            game(path, index + 1);
            rahHalHa[index] = rahHalHa[index + 1];

            if (index + 1 < path.length()) {
                game(path, index + 2);
                rahHalHa[index] += rahHalHa[index + 2];

                if (index + 2 < path.length()) {
                    game(path, index + 3);
                    rahHalHa[index] += rahHalHa[index + 3];
                }
            }
        }
    }
}
