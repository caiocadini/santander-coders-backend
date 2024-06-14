package br.com.santandercoders.estruturadedados.problemas;

import java.util.Queue;

public class RevertigKFirstElements {
    public static Queue<Integer> reverseFirstKElements(Queue<Integer> queue, int k){
        solve(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }
    private static void solve (final Queue<Integer> queue, final int k){
        if(k == 0) return;
        int element = queue.remove();
        solve(queue, k-1);
        queue.add(element);
    }
}
