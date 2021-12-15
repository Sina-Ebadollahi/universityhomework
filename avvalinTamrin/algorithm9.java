package avvalinTamrin;

import java.util.Scanner;

public class algorithm9 {
        public static void main(String[] args) {
                // introduction to the java program by the Author
                new introduction();
                // الگوریتمی بنویسید که شعاع دایره را گرفته و محیط و مساحت ان را محاسبه و چاپ نماید.
                double radius, circleArea, circlePerimeter;
                final double PI = 3.14;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the Radius  of the circle Professor Pirahesh");
                radius = scanner.nextDouble();
                circleArea = Math.pow(radius, 2) * PI;
                circlePerimeter = (radius + radius) * PI;
                System.out.printf("Area of the circle is : %f & Perimeter is : %f", circleArea, circlePerimeter);

        }
}
