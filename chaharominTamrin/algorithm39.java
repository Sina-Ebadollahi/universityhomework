package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm39 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه كسينوس زاويه x را با استفاده از بسط تيلور تا دقت p محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'x' Professor Pirahesh");
        int x = scanner.nextInt();
        System.out.println("Enter 'p' Professor Pirahesh");
        int p = scanner.nextInt(), c = 2, a = x, cos = 0;
        while(p <= Math.abs(a)){
            cos += a;
            c += 2;
            a = a * (-1) * x / (c * c);
        }
        System.out.println("answer of Cousins is : " +  cos);
    }
}
