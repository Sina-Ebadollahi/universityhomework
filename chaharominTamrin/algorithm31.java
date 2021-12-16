package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm31 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه دو عدد را گرفته و مقدار آنها را با استفاده از متغير كمكي جابجا نمايد.(swap)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b one by one !");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int aux = a;
        a = b;
        b = aux;
        System.out.printf("\na : %d & b : %d",a, b);
    }
}
