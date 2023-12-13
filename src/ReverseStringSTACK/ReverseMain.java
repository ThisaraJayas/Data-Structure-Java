package ReverseStringSTACK;

import static ReverseStringSTACK.MainStringBuilder.reverse;

public class ReverseMain {
    public static void main(String[] args){
//        The StringBuffer and StringBuilder classes are used when there is a
//        necessity to make a lot of modifications to Strings of characters.
        StringBuffer sb = new StringBuffer("Thisara");
        reverse(sb);

        System.out.println("Reversed Sting is : "+sb);

    }
}
