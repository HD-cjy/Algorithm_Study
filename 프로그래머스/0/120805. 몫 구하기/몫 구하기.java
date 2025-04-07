class Solution {
    public int solution(int num1, int num2) {
            if (num1 <= 0 || num2 <= 0) {
            throw new IllegalArgumentException("num1과 num2는 0보다 커야 합니다.");
            }
        int answer = num1 / num2;
        return answer;
    }
}

