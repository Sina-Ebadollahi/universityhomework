package dovvominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm14 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه اعداد طبيعي كوچكتر مساوي n را چاپ نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' Professor Pirahesh!");
        int n = scanner.nextInt();
        for(int i = 1; i < n;i++){
            System.out.printf("Numbers are %d\n", i);
        }
    }
}
