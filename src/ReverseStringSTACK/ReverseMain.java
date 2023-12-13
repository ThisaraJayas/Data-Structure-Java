package ReverseStringSTACK;

import static ReverseStringSTACK.MainStringBuilder.reverse;

public class ReverseMain {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Thisara");

        reverse(sb);

        System.out.println(sb);

    }
}
