public class MaxFinder {
    public int findMax(int[] numbers) {
        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];  
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();
        int[] numbers = {3, 5, 7, 2, 8, 10, 1, 4};
        int maxNumber = maxFinder.findMax(numbers)
        System.out.println("The maximum number is: " + maxNumber);
    }
}
