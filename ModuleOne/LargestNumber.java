package ModuleOne;

import java.util.Scanner;

import java.util.PriorityQueue;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10,20,30,15,5};

        int nTh = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((b,a) -> b-a);
        
        for(int j = 0; j < numbers.length; j++){
            priorityQueue.add(numbers[j]);
            if(priorityQueue.size() > nTh){
                System.out.println(priorityQueue);
                priorityQueue.poll();
            }
        }

        System.out.println(priorityQueue.peek());
        sc.close();
    }
}
