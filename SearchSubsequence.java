public class SearchSubsequence {
    public static void main(String[] args){
        String str="abcd";
        String str1="abd";
        int first=0;
        int second=0;
        int n=0;
        while(first<str.length()-1){
           if(str.charAt(first)==str1.charAt(second)){
               first++;
               second++;
               n++;
           }else{
           first++;
           }
        }
        if(n==str1.length()-1){
            System.out.print("String Subquences Found");
        }
        else{
            System.out.print("String Subquences Not Found");
        }
    }
}
