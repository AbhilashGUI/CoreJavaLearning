package AssignmentPrograms;

public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        for (int number : numbers) {
            System.out.println("Reversed array: " + number);

        }
    }
    }

