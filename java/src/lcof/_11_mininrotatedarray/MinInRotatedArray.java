package lcof._11_mininrotatedarray;

public class MinInRotatedArray {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int p0  = 0, p2 = len - 1;
        int p1;
        while (p0 < p2) {
            p1 = (p0 + p2) / 2;
            if (numbers[p1] < numbers[p2]) {
                p2 = p1;
            } else if (numbers[p1] > numbers[p2]) {
                p0 = p1 + 1;
            } else {
                p2--;
            }
        }
        return numbers[p0];
    }
}
