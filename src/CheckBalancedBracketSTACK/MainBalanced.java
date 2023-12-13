package CheckBalancedBracketSTACK;

import static CheckBalancedBracketSTACK.BalancedBrackets.areBracketsBalanced;

public class MainBalanced {
    public static void main(String[] args){
        String exp = "([{}])";

        if(areBracketsBalanced(exp)){
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }
}
