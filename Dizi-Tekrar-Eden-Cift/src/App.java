import java.util.Arrays;
public class App {
    static boolean isFind(int []arr,int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] dizi = {3, 5, 6, 1, 2, 4, 6, 3, 6, 6, 2, 8, 8, 3, 10, 10};
        int [] cift = new int[dizi.length];
        int baslangic=0;
        for (int i = 0; i < dizi.length; i++){
            for (int j = 0; j < dizi.length; j++){
                if ((i != j) && (dizi[i] == dizi[j])) {
                    if(!isFind(cift,dizi[i])){
                        cift[baslangic++] = dizi[i];
                        break;
                    }
                }
            }
        }
        for (int value: cift) {
            if ((value!= 0) && (value%2!=1)) {
                System.out.println(value);
            }
        }
       }
    }