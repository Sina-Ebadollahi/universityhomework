package avvalinTamrin;

import java.util.Scanner;

public class algorithm7 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که طول و عرض مستطیل را گرفته و محیط و مساحت انرا محاسبه کرده و چاپ نماید.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length Professor Pirahesh!");
        int length = scanner.nextInt();
        System.out.println("Enter the width Professor Pirahesh!");
        int width = scanner.nextInt();
        int area = (length + width) * 2;
        int perimeter = length * width;
        System.out.printf("Perimeter is : %d, Area is : %d ", perimeter, area);
    }
}
