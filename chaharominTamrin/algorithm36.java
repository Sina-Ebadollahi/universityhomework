package chaharominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm36 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه حاصل جمع ارقام يك عدد را بدست آورد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        int sum = 0;
        while(a > 0){
            int c = a % 10;
            sum += c;
            a /= 10;
        }
        System.out.println("sum of numbers is : " + sum);
    }
}
