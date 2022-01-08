class Solution {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int ans = solution(board, moves);
        System.out.println(ans);
    }
    public static int solution(int[][] board, int[] moves) {
        Integer answer = new Integer(0);
        int idx, i = 0;
        int[] store = new int[moves.length];

        for (int e : moves) {
            idx = 0;
            while (idx < board[0].length) {
                if (board[idx][e-1] != 0) {
                    if (i == 0) { store[i++] = e; board[idx][e-1] = 0; }
                    else {
                        if (store[i-1] == e) { i--; answer++; }
                        else { store[i++] = e; board[idx][e-1] = 0; }
                    }
                    break;
                }
                else { idx++; }
            }
        }
        return answer;
    }
}