class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;  // 홀수 개수 계산
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = 2 * i + 1;  // 홀수: 1, 3, 5, ...
        }

        return answer;
    }
}
