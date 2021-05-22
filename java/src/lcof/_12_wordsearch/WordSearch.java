package lcof._12_wordsearch;

/**
 * <a href="https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/">剑指 Offer 12. 矩阵中的路径</a>
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (search(board, i, j, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, int i, int j, String word, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(k)) return false;
        if (k == word.length() - 1) return true;
        board[i][j] = '\0';
        boolean res = search(board, i + 1, j, word, k + 1) ||
                search(board, i - 1, j, word, k + 1) ||
                search(board, i, j + 1, word, k + 1) ||
                search(board, i, j - 1, word, k + 1);
        board[i][j] = word.charAt(k);
        return res;
    }
}
