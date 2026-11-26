package part2_uppercase;

import common.Input;
public class Main {
    public static void main(String[] args) {
        do { System.out.println(Input.text("Enter any string: ").toUpperCase(java.util.Locale.ROOT)); }
        while(Input.again());
    }
}
