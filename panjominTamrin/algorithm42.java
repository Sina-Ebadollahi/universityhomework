package panjominTamrin;
import java.util.Scanner;
import avvalinTamrin.introduction;
public class algorithm42 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه n عدد را از ورودي گرفته مشخص نمايد هركدام از آنها عدد اول هستند يا خير.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            int a = scanner.nextInt();
            int flag = 0;
            for(int j = 2; j <= a/2; j++){
                if(a % j == 0){
                    flag = 1;
                    System.out.println("this number is " + a + " is a prime number");
                }else{
                    System.out.println("its not a prime number");
                }
            }

        }
    }
}
