package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm29 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // : الگوريتمي بنويسيد كه تعداد مقسوم عليه‌هاي يك عدد، بجز يك و خودش، را محاسبه چاپ نمايد
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you preferred number Professor Pirahesh");
        int n = scanner.nextInt();
        for(int i = 2; i <= n/2; i++){
            if((n/2) % i == 0){
                System.out.println("Divisors are : " + i);
            }
        }

    }
}
