package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm32 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه دو عدد را گرفته و مقدار آنها را بدون استفاده از متغير كمكي جابجا نمايد.(swap)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' and 'b' Professor Pirahesh");
        int a = scanner.nextInt(), b = scanner.nextInt();
        a += b;
        b = a - b;
        a = a - b;
        System.out.printf("a is %d & b is : %d", a, b);
    }
}
