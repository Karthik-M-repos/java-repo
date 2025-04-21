public class p1{
    public static void main(String[] args){
        int value1=10;
        int value2=20,value3;

        System.out.println("Value1:"+value1+" Value2:"+value2);
        
        System.out.println("Arithmetic ");
        System.out.println("value1 + value2 :"+(value1 + value2));
        System.out.println("value2 - value1 :"+(value2 - value1));
        System.out.println("value2 * value1 "+(value1 * value2));
        System.out.println("value2 / value1 :"+(value2 / value1));
        System.out.println("value2 % value1 :"+(value2 % value1));
        
        System.out.println("Relational \n");
        System.out.println("value1 == value2 :"+(value1 == value2));
        System.out.println("value1 != value2 :"+(value1 != value2));
        System.out.println("value1 >= value2 :"+(value1 >= value2));
        System.out.println("value1 <= value2 :"+(value1 <= value2));
        System.out.println("value1 < value2 :"+(value1 < value2));
        System.out.println("value1 > value2 :"+(value1 > value2));
        
        System.out.println("Logical");
        System.out.println("(value1 < value2) && (value1>value2) :"+(value1<value2 && value1>value2));
        System.out.println("(value1 < value2) || (value1>value2) :"+(value1<value2 || value1>value2));
        System.out.println("!(value1<value2) :"+!(value1<value2));
        
        System.out.println("Assignment");
        value3 = value2;
        System.out.println("value3 = value2 :"+value3);
        System.out.println("value1 += value2 :" +(value1 += value2));
        System.out.println("value1 -= value2 :" +(value1 -= value2));
        System.out.println("value1 *= value2 :" +(value1 *= value2));
        System.out.println("value1 /= value2 :" +(value1 /= value2));
        System.out.println("value1 %= value2 :" +(value1 %= value2));
        
        System.out.println("Bitwise");
        System.out.println("value1 & value2 :"+(value1 & value2));
        System.out.println("value1 | value2 :"+(value1 | value2));
        System.out.println("value1 ^ value2 :"+(value1 ^ value2));
        System.out.println("~value2 :"+(~value2));
        System.out.println("value1 >> 1 :"+(value1 >> 1));
        System.out.println("value1 << 1 :"+(value1 << 1));
        
        System.out.println("Unary \n- :"+(-value2));
        System.out.println("++value1 :"+(++value1));
        System.out.println("--value1 :"+(--value1));
        
        System.out.println("Ternary \n(value1>value2) ? value1 : value2) :"+((value1>value2) ? value1 : value2));
   

        
    }
}