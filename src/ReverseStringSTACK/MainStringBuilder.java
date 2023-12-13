package ReverseStringSTACK;

public class MainStringBuilder {
    public static void reverse(StringBuffer str){
        int num = str.length();
        ReverseStack stack = new ReverseStack(num);

        for (int i=0;i<num;i++){
            stack.push(str.charAt(i));
        }

        for(int i=0;i<num;i++){
            char ch = stack.pop();
            str.setCharAt(i,ch);
        }
    }
}
