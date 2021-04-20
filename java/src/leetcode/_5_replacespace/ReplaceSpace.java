package leetcode._5_replacespace;

/**
 * <a href="https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/">剑指 Offer 05. 替换空格</a>
 */
public class ReplaceSpace {
    public String replaceSpace(String str) {
        if (str == null) return null;
        char[] result = new char[str.length() * 3];
        int    size   = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result[size++] = '%';
                result[size++] = '2';
                result[size++] = '0';
            } else {
                result[size++] = c;
            }
        }
        return new String(result, 0, size);
    }
}
