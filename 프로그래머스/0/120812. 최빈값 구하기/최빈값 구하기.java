import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // 배열 요소 개수 세기
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0;
        int mode = -1;
        boolean isDuplicate = false;

        // 최빈값 찾기
        for (int key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                mode = key;
                isDuplicate = false;
            } else if (count == maxCount) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : mode;
    }
}
