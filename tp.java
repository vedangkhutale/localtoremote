class Demo {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 7 };
        bs(array, 5);
        System.out.println(bs(array, 5));
    }

    static int bs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}