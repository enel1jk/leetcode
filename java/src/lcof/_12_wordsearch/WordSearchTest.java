package lcof._12_wordsearch;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {
    @Test
    public void test() {
        WordSearch solution = new WordSearch();
        char[][] board = {
                new char[]{'A', 'B', 'C', 'E'},
                new char[]{'S', 'F', 'C', 'S'},
                new char[]{'A', 'D', 'E', 'E'}
        };
        Assert.assertTrue(solution.exist(board, "ABCCED"));
        Assert.assertTrue(solution.exist(board, "SEE"));
        Assert.assertFalse(solution.exist(board, "ABCB"));
        Assert.assertTrue(solution.exist(board, "CCFBA"));
    }
}

/*

    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if(k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

    */
