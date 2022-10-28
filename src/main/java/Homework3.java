public class Homework3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, -15, 16, 17, 18, 19, 45};

        int summ = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 5 && arr[i] < 45) {
                summ = summ + arr[i];
            }
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
            i++;
        }
        System.out.println("Summ: " + summ);
    }
}
