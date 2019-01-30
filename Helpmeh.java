import java.util.Scanner;

public class Helpmeh {
    public static void main(String[] args) {

        Scanner yo = new Scanner(System.in);
        System.out.println("Vad är ditt k-värde?");
        double k = yo.nextDouble();
        System.out.println("Vad är ditt a-värde?");
        double längd1 = yo.nextDouble();
        System.out.println("Vad är ditt b-värde?");
        double längd2 = yo.nextDouble();
        int n = 1000;
        double deltax = (längd2-längd1)/n;
        double answer = 0;

        for (double x = längd1 ; x < längd2 ; x += deltax) {
            answer += deltax * ((k * x) + (k * (x + deltax)))/2;
        }

        System.out.println("Svaret är " + answer + " A.e");
    }
}
