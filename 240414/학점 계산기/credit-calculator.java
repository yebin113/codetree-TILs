import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i<n;i++){
            double grade = sc.nextDouble();
            arr[i]= grade;
            sum += grade;
        }
        double avg = sum/n;
        System.out.printf("%.1f\n",avg);
        if(avg >= 4){
            System.out.print("Perfect");
        } else if (avg>=3.0){
            System.out.print("Good");

        }else{
            System.out.print("Poor");

        }

    }

}