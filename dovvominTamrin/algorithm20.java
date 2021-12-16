package dovvominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm20 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوریتمی بنویسید که حاصل توان دو عدد را با استفاده از ضرب‌هاي متوالي بدست آوريد.
        int a, b, pow, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        a = scanner.nextInt();
        System.out.println("Enter 'b' Professor Pirahesh");
        b = scanner.nextInt();
        pow = a;
        // a**b
        for(i = 1; i < b; i++){
            pow *= a;
        }
        System.out.println("calculated power of a is " + pow);
    }

}
