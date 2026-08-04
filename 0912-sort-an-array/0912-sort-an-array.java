class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        //bubble sort
        // for(int i = 0; i < n - 1; i++) {
        //     for(int j = 0; j < n - i - 1; j++) {
        //         if(nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }
        // }

        // selection sort
        // for(int i = 0; i < n - 1; i++) {
        //     int minIdx = i;
        //     for(int j = i + 1; j < n; j++) {
        //         if(nums[j] < nums[minIdx]) {
        //             minIdx = j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[minIdx];
        //     nums[minIdx] = temp;
        // }

        // insertion sort
        // for(int i = 1; i < n; i++) {
        //     int key = nums[i];
        //     int j = i-1;
        //     while(j >= 0 && key < nums[j]){
        //         nums[j+1] = nums[j];
        //     }
        //     nums[j+1] = key;
        // }

        //Quick Sort
        //quickSort(nums, 0, n-1);

        //Merge Sort
        mergeSort(nums, 0, n-1);

        return nums;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r){
        int temp[] = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= r) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= r) {
            temp[k++] = arr[j++];
        }
        for(i = l; i <= r; i++) {
            arr[i] = temp[i-l];
        }
    }

    private void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx-1);
            quickSort(arr, pivotIdx+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}