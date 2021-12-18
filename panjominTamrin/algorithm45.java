package panjominTamrin;
import java.util.Scanner;
import avvalinTamrin.introduction;
public class algorithm45 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه an را با استفاده از كامپيوتري كه تنها عملگر افزايش يك واحد به متغيرها دارد را انجام دهد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter 'n' Professor Pirahesh");
        int n = scanner.nextInt();
        int pow = a;
        for(int i = 1; i < n; i++){
            int aux = pow;
            int j = 1;
            while(j < a){
                for(int k = 1; k <= aux; k++){
                 pow += 1;
                }
                j++;
            }
        }
        System.out.println("powered number is : " + pow);
    }
}
