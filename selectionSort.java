public class selectionSort {
    public static void selectionSort_1(int[] array) {
        // go through the unsorted array without comparing the last element
        for (int i = 0; i < array.length - 1; i++) {
            int minNum = i;
            // for loop which goes through the elements after the current element and checks
            // if it is smaller then the current element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minNum]) {
                    minNum = j;
                }
            }
            int temp = array[i]; // temp var which holds the current number
            // swap
            array[i] = array[minNum]; // swap the current larger number to the number in front of it
            array[minNum] = temp; // swap the smallest number to the number behind it
        }
    }

    // Method for printing the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + "");
        }
    }

    // main
    public static void main(String[] args) {
        int arr[] = { 5, 9, 7, 4, 2, 5, 1, 10 }; // store numbers in array
        // print original array
        System.out.println("Orignal Array:");
        printArray(arr);

        selectionSort_1(arr);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
