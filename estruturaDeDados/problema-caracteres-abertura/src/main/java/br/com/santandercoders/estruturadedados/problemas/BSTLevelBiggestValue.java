package br.com.santandercoders.estruturadedados.problemas;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class BSTLevelBiggestValue {
    public static List<Integer> biggestValues(Arvore tree){
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);
        return list;
    }

    private static void solveTree(final Node node, final int level, final ArrayList<Integer> list){
        if (node == null) return;
        if(level == list.size()){
            list.add(node.value);
        }else{
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.right, level+1 , list);
    }

}
