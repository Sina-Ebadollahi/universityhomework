package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm34 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه حاصل ay را با تعداد گردش 〖log〗_2^y محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'y' Professor Pirahesh");
        int y = scanner.nextInt();
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        double d = Math.floor(Math.log(y)/Math.log(2)) + 1;
        int s = 1;
        while(d < 0){
            s *= s;
            if((y & (int)Math.pow(2, d - 1)) != 0){
                s *= a;
                d -= 1;
            }
        }
        System.out.println("answer is : " + d);
    }
}
