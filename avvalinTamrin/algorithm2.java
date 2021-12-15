package avvalinTamrin;

import java.util.Scanner;

public class algorithm2 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که سه عدد از ورودی دریافت کرده مجموع و میانگین سه عدد را محاسبه و چاپ کند.
        Scanner scanner = new Scanner(System.in);
        int a, b, c, sum, avg;
        System.out.print("Enter 'a' Professor Pirahesh : ");
        a = scanner.nextInt();
        System.out.print("Enter 'b' Professor Pirahesh : ");
        b = scanner.nextInt();
        System.out.print("Enter 'c' Professor Pirahesh : ");
        c = scanner.nextInt();
        sum = a + b + c;
        avg = sum / 3;
        System.out.printf("sum is %d & average is %d.", sum, avg);
    }
}
