package avvalinTamrin;

import java.util.Scanner;

public class algorithm1 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که دو عدد از ورودی دریافت کرده مجموع دو عدد را محاسبه و چاپ نماید.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.printf("Sum is %d",sum);
    }
}
