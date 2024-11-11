package BinarySearch.SubtractionOperationPrime;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean primeSubOperation(int[] nums) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                continue;
            }
            int index = binarySearch(primes, nums[i] - nums[i + 1]);
            if (index == primes.size() || primes.get(index) >= nums[i]) {
                return false;
            }
            nums[i] -= primes.get(index);
        }
        return true;
    }

    private int binarySearch(List<Integer> primes, int x) {
        int s = 0, e = primes.size();
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (primes.get(mid) > x) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}