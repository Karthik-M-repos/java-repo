package ModuleOne;

import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        
        int frontspaces, middlespaces;
        for(int i = 1; i <= row; i++) {
            frontspaces = row - i;
            middlespaces = row - 1;
            for(int space = 0; space < frontspaces; space++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            for(int space = 0; space < middlespaces; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
