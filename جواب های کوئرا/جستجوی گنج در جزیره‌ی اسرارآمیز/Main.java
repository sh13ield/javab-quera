import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        scanner.close();


        numbers = Arrays.stream(numbers).distinct().sorted().toArray();

        List<List<Integer>> results = new ArrayList<>();
        findTarkib(numbers, target, 0, new ArrayList<>(), results);

        for (List<Integer> Tarkib : results) {
            System.out.println(Tarkib);
        }
    }

    private static void findTarkib (int[] numbers, int target, int startIndex, List<Integer> currentCombination, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(currentCombination));
            return;
        }

        if (startIndex == numbers.length || numbers[startIndex] > target) {
            return;
        }

        currentCombination.add(numbers[startIndex]);
        findTarkib(numbers, target - numbers[startIndex], startIndex + 1, currentCombination, results);
        currentCombination.remove(currentCombination.size() - 1);

        findTarkib(numbers, target, startIndex + 1, currentCombination, results);
    }
}
