package ModuleOne;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intNumber = sc.nextInt();
        String binary = "";
        int leftout = intNumber;
        int count = intNumber - 1;
        while(count >= 0){
         int c = (int)Math.pow(2,count--);
         if(c > leftout){
            binary += "0";
            continue;
         }
         leftout -= c;
         binary += "1";
        }
        System.out.println(binary);
        sc.close();
    }
    
}
