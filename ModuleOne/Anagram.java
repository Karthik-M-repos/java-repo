package ModuleOne;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "abcd";
        String string2 = "ABCD";
        
        String lowerstring1 = string1.toLowerCase();
        String lowerstring2 = string2.toLowerCase();
        int[] stringcount1 = new int[27];
        int[] stringcount2 = new int[27];
        int i=0;
        while(i < lowerstring1.length()){
            stringcount1[lowerstring1.charAt(i)-'a']++;
            i++;
        }
        i=0;
        while(i < lowerstring2.length()){
            stringcount2[lowerstring2.charAt(i)-'a']++;
            i++;
        }
        boolean anagram = true;
        i=1;
        while(anagram && i<27){
          if(stringcount1[i] != stringcount2[i]){
            anagram = false;
            break;
          }
          
          i++;
        }
        
        if(anagram){
            System.out.println("Both strings are anagram");
        } else{
            System.out.println("Strings are not anagram");
        }


    }
}
