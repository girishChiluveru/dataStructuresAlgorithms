
class Array {

    public static void rec(int arr[], int i, int v) {
        //base case
        if (arr.length == i) {
            printArray(arr);
            return;
        }
        //recusion
        arr[i] = v;
        rec(arr, i + 1, v + 1);
        arr[i] = v - 2;

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        rec(arr, 0, 1);
        printArray(arr);
    }
}
