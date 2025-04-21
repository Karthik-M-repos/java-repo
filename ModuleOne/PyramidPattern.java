package ModuleOne;

public class PyramidPattern {
    public static void main(String[] args) {
        int row=4;
        
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
