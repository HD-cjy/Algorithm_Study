class Solution {
    public int solution(int n) {
        // 한 판에 7조각이므로 n명을 7로 나눈 뒤 올림 처리
        return (n + 6) / 7;
    }
}
