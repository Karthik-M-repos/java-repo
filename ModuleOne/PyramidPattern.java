package ModuleOne;

import java.util.*;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        
        int spaces;
        for(int i=1;i<=row;i++){
            spaces=row-i;
            for(int space=0;space<spaces;space++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
