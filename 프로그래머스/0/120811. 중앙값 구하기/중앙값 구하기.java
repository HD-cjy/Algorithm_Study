import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 정렬
        int midIndex = array.length / 2; // 가운데 인덱스
        return array[midIndex]; // 중앙값 반환
    }
}
