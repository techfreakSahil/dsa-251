class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        frequency = Counter(arr)
        sorted_frequency = sorted(frequency.items(), key=lambda x: x[1])
        unique_count = len(sorted_frequency)
        for _, freq in sorted_frequency:
            if k >= freq:
               k -= freq
               unique_count -= 1
            else:
                break
        return unique_count