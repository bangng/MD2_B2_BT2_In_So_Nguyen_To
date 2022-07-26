import java.util.Scanner;

public class Main {
    public static boolean checkPrime(int j){
        if (j <= 2){
            return true;
        }else {
            for (int i = 2; i <= Math.sqrt(j) ; i++) {
                if (j % i == 0){
                    return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hiển Thị Số Nguyên Tố");
        Scanner scanner = new Scanner(System.in);
        int number ;
        int count = 0;
        int j = 2;
        number = scanner.nextInt();
        while (count < number){
            if (checkPrime(j)){
                System.out.println(j);
                count++;
            }
            if (count>=number){
                break;
            }
            j++;
        }

    }
}
