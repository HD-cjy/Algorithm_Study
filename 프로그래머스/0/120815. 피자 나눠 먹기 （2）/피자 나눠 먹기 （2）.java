class Solution {
    public int solution(int n) {
        int pizzas = 1;

        // 사람 수와 총 조각 수가 나누어떨어질 때까지 반복
        while ((pizzas * 6) % n != 0) {
            pizzas++;
        }

        return pizzas;
    }
}
