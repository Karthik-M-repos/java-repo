package ModuleOne;

public class Statements {

    public static int generateRandom(){
        return (int)Math.random() * 10 * 7 / 10 +1 ;
    }

    public static void main(String[] args) {
        //if-else if switch for for each

        int value1 = 10;
        int value2 = 20;
        //int value3 = 30;
        int whilecounter = 0 , dowhilecounter = 0;

        //if condition
        if(value2 > value1){
            System.out.println("if condition got passed");
        }

        //if-else condition
        if(value2 < value1){
            System.out.println("if part in if-else didnot pass");
        }else{
            System.out.println("if part in if-else didnot pass");
        }

        //switch case
        int day=generateRandom();
        switch(day){
            case 1 : System.out.println("Sunday");  break;

            case 2 : System.out.println("Monday");  break;
            
            case 3 : System.out.println("Tuesday");  break;
            
            case 4 : System.out.println("Wednesday");  break;
            
            case 5 : System.out.println("Thursday");  break;
            
            case 6 : System.out.println("Friday");  break;
            
            case 7 : System.out.println("Saturday");  break;
            
            default : System.out.println("No value is passed in switch-case");   
        }

        //while 
        while(whilecounter <= value1){
            System.out.print(++whilecounter +" ");
        }

        //do while
        do{
            dowhilecounter++;
            System.out.print(dowhilecounter +" ");

        }while(dowhilecounter<value1);

        //for loop
        for(int counter = value1;counter < value2;counter++){
            System.out.print(counter+" ");
        }

        

    }
}
