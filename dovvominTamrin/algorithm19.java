package dovvominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm19 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه كه اعداد زوج طبيعي كوچكتر مساوي n را چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println("even numbers : " + i);
            }
        }
    }
}
