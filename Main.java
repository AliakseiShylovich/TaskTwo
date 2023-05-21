public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,};
        int sum = 0;
        int indexEnd = 3;
        for (int index = 3; index <= indexEnd; index += 3) {
            sum = sum + array[index];
        }
        System.out.println(sum);
    }
}