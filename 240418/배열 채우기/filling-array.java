import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;
        for (int i = 0;i<10;i++){
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            arr[i] = a;
            n += 1;

        }
        
        for (int i = 0;i<10;i++){
            if (arr[9-i] > 0){

            System.out.printf("%d ",arr[9-i]);
            }
            
        }
        
    }
}