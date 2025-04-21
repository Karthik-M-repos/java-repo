import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        generatePattern();
    }
    public static void generatePattern(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int i , j , n , spaces = 0;
        int rows = sc.nextInt();
        char character = '*';
        for(i = 1; i <= rows; i++){
          n = (2*rows-1) - spaces;
          for(j = 1; j <= n/2 ; j++){
            System.out.print(character);
          }
          for(int m = 0; m < spaces; m++){
            System.out.print(" ");
          }
          for(j = n % 2 + n / 2 ; j > 0 ; j--){
            System.out.print(character);
          }
          System.out.println();
          spaces = 2 * i - 1;
        }
        spaces -= 2;
        for(i = 2; i <= rows;i++){
            spaces -= 2;
            if(spaces < 0){
                spaces = 0;
            }
            n = (2*rows-1) - spaces;
            for(j = 1; j <= n/2 + n % 2; j++){
                System.out.print(character);
            }
            for(int m = 0; m < spaces; m++){
                System.out.print(" ");
            }
            for(j = n / 2 ; j > 0 ; j--){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
