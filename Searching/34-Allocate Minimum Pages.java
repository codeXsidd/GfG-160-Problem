class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        
        if (k > n) return -1;
        
        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;              
        }
        
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isPossible(arr, n, k, mid)) {
                result = mid;     
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        
        return result;
    }
    
    
    private boolean isPossible(int[] arr, int n, int k, int maxPages) {
        int students = 1;
        int sum = 0;
        
        for (int pages : arr) {
            if (sum + pages > maxPages) {
                students++;
                sum = pages;
                if (students > k) return false;
            } else {
                sum += pages;
            }
        }
        
        return true;
    }
}
