package sevvominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm22 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه مربع (n2) اعداد طبيعي كوچكتر مساوي n را بدون ضرب بدست آورد: (در اين روش مربع قبلي با عدد فردي كه به ترتيب افزايش پيدا ميكنند جمع مي‌گردد و مربع بعدي بدست مي‌آيد)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        int i = 0;
        while(i < n){
            a += b;
            System.out.println("to powered numbers that are smaller than " + n +" which is " + i + " are : " + a);
            b += 2;
            // there will be no problem if you even put i++ here
            ++i;
        }
    }
}
