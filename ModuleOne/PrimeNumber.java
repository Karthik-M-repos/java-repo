package ModuleOne;

import java.util.*;

public class PrimeNumber {

    public static boolean isPrime(int number){
        for(int i=2;i<number/2;i++){
            if(number % 2==0){
                return false;
            } 
        }
        return true;
        
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter=0;
        List<Integer> list = new ArrayList<>();
        for(int i = number;i < number+100;i++){
          if(counter >= 5){
            break;
          }
          if(isPrime(i)){
            list.add(i);
            counter++;
          }
        }
        System.out.println(list);
        sc.close();
    }

}
