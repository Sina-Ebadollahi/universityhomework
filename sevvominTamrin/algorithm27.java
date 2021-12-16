package sevvominTamrin;

import avvalinTamrin.introduction;

import java.util.Scanner;

public class algorithm27 {
    public static void main(String[] args) {
        // introduction to the java program by the Author
        new introduction();
        // الگوريتمي بنويسيد كه بزرگترين مقسوم عليه مشترك (ب.م.م) و كوچكترين مضرب مشترك (ك.م.م) دو عدد را محاسبه نمايد.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of 'a' Professor Pirahesh");
        int a = scanner.nextInt();
        System.out.println("Enter amount of 'b' Professor Pirahesh");
        int b = scanner.nextInt();
        if(a < b){
            int swapVar = b;
            b = a;
            a = swapVar;
        }
        int BMM = calculationFunction(a, b);
        int KMM = (a * b)/BMM;
        System.out.println("BMM is : " + BMM + " and KMM is : " + KMM);
    }
    public static int calculationFunction(int a, int b){
        int mod = a % b;
        int n1 = mod;
        int n2 = b;
        while(mod != 0){
            mod = n2 % n1;
            n2 = n1;
            n1 = mod;
        }
        return n2;
    }
}
