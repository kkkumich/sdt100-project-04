package part3_reverse;

import common.Input;
public class Main {
    public static String reverse(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) result.append(s.charAt(i));
        return result.toString();
    }
    public static void main(String[] args) {
        do { System.out.println(reverse(Input.text("Enter any string: "))); } while(Input.again());
    }
}
