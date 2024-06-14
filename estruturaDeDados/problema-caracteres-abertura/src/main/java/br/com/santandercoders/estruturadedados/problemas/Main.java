package br.com.santandercoders.estruturadedados.problemas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(ExpressionChecker.solve("(2*5{3/4)}"));
        System.out.println(ExpressionChecker.solve("(2*5{3/4})"));

        /////////////////////////////////

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(RevertigKFirstElements.reverseFirstKElements(queue, 3));

        ///////////////////////////////////////////

        Arvore arvore = new Arvore();
        arvore.insert(100);
        arvore.insert(10);
        arvore.insert(5);
        arvore.insert(6);
        arvore.insert(1);
        arvore.insert(7);
        arvore.insert(5);

        System.out.println(BSTLevelBiggestValue.biggestValues(arvore));


    }


}