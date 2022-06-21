import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[dizi.length];
        int visited = -1;
        System.out.println("Dizi: " + Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            int count = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]){
                    frequency[j] = visited;
                    count++;
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            if (frequency[i] != visited) {
                System.out.println(dizi[i] + " tekrarı " + frequency[i] + " defa ");
            }
        }
    }
}