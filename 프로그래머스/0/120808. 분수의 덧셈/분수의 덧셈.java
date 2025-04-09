// 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
// 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 
// 배열을 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모의 최소공배수 구하기
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        
        // 통분하여 분자 계산
        int newNumer1 = numer1 * (lcm / denom1);
        int newNumer2 = numer2 * (lcm / denom2);
        
        // 분자 합산
        int numerSum = newNumer1 + newNumer2;
        
        // 기약분수로 만들기 위해 분자, 분모의 최대공약수로 나누기
        int gcdOfResult = gcd(numerSum, lcm);
        
        int[] answer = {numerSum / gcdOfResult, lcm / gcdOfResult};
        return answer;
    }
    
    // 최대공약수(GCD) 계산 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}