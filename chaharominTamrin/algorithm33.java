package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm33 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه تمامي مقسوم عليه‌هاي يك عدد را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                System.out.println("numbers are : " + i);
            }
        }
    }
}
