class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            price = price * 80 / 100;  // 20% 할인
        } else if (price >= 300000) {
            price = price * 90 / 100;  // 10% 할인
        } else if (price >= 100000) {
            price = price * 95 / 100;  // 5% 할인
        }
        return price;
    }
}
