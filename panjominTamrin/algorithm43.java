package panjominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm43 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنوسيد كه عمل ضرب دو عدد را با استفاده از كامپيوتري كه تنها عملگر افزايش يك واحد به متغيرها دارد را انجام دهد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        int product = a;
        for(int i = 1; i < b; i++){
            for(int j = 0; j < a; j++){
                product += 1;
            }
        }
        System.out.println("answer is : "  + product);
    }
}
