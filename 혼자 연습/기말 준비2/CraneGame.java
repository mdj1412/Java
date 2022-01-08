import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int answer = solution(board, moves);
        System.out.println(answer);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Deque<Integer>> list = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i=0;i<board[0].length;i++) {
            int j = board.length - 1;
            list.add(new ArrayDeque<>());
            while (board[j][i] != 0) {
                if (j == -1) { break; }
                list.get(i).offerLast(board[j][i]);
                j--;
            }
        }

        for (int e : moves) {
            if (list.get(e-1).isEmpty()) { continue; }
            if (stack.size() == 0) {
                stack.offerLast(list.get(e-1).pollLast()); 
            }
            else if (stack.peekLast() == list.get(e-1).peekLast()) {
                stack.pollLast();
                list.get(e-1).pollLast();
                answer++;
            }
            else {
                stack.offerLast(list.get(e-1).pollLast());
            }
        }

        return 2 * answer;
    }
}