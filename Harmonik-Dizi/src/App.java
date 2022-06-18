public class App {
    public static void main(String[] args) throws Exception {
        double arr[] = { 13, 14, 15, 16, 17 };
        int n = arr.length;
        double sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + 1 / arr[i];
        System.out.println(n / sum);
    }
}