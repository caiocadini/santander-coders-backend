package br.com.santandercoders.estruturadedados.problemas;

import java.util.Set;
import java.util.Stack;

public class ExpressionChecker {
    public static boolean solve(String expressao){
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');

        Stack<Character> stack = new Stack<>();

        for( char c: expressao.toCharArray()){
            if(openSymbols.contains(c))
                stack.push(c);
            if(closeSymbols.contains(c)){
                if(stack.isEmpty())
                    return false;
                var open = stack.pop();
                if (open == '(' && c !=')') return false;
                if (open == '{' && c !='}') return false;
                if (open == '[' && c !=']') return false;

            }

        }
        return stack.isEmpty();
    }
}
