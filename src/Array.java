import java.util.Scanner;

public class Array {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static boolean isSorted(int[] arr) {
        boolean sorted = false;
        int a = 0, b = 0;
        // check for ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] >= arr[i + 1])) a += 1;
        }
        // check for descending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] <= arr[i + 1])) b += 1;
        }
        if (a == 0 || b == 0) sorted = true;
        return sorted;
    }

    public static void elementSwap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void insertElement(int[] array, int size, int index, int element) {
        if (index >= 0 && index < size) { // size=.length
            for (int i = array.length - 1; i > index; i--)
                array[i] = array[i - 1];
            array[index] = element;
            printArray(array);
        } else System.out.println("Array index is out of range.");
    }

    public static void deleteElement(int[] array, int size, int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++)
                array[i] = array[i + 1];
            printArray(array);
        } else System.out.println("Array index is out of range.");
    }

    public static void mergeArray(int[] array1, int[] array2, int[] array3) {
        int i = 0;
        while (i < array1.length) {
            array3[i] = array1[i];
            i++;
        }
        int j = 0;
        while (j < array2.length) {
            array3[i] = array2[j];
            i++;
            j++;
        }
        printArray(array3);
    }

    public static void linearSearch(int[] arr, int element) {
        boolean found = false;
        int i;
        for (i = 0; i < arr.length; i++) { // to find string: if(arr[i].equals(element))
            if (arr[i] == element) {
                System.out.println(element + " is found at index " + i);
                found = true;
                break; // use 'break' if element is not repeated
            }
        }
        if (!found) System.out.println(element + " is not found");
    }

    public static void binarySearch(int[] arr, int element) {
        boolean sorted = isSorted(arr);
        if (sorted) {
            boolean found = false;
            int low = 0; // lower index
            int high = arr.length - 1; // higher index
            while (low <= high) {
                int mid = (low + high) / 2; // middle index
                if (arr[mid] == element) {
                    System.out.println(element + " is found at index " + mid);
                    found = true;
                    break; // use 'break' if element is not repeated
                } else if (arr[mid] < element) low = mid + 1;
                else high = mid - 1;
            }
            if (!found) System.out.println(element + " is not found");
        } else System.out.println("Array is not sorted");
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = isSorted(arr);
        if (!isSorted) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) elementSwap(arr, j, j + 1);
                }
            }
            printArray(arr);
        } else System.out.println("Array is already sorted");
    }

    public static void selectionSort(int[] arr) {
        boolean isSorted = isSorted(arr);
        if (!isSorted) {
            for (int i = 0; i < arr.length - 1; i++) {
                int smallest = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[smallest]) {
                        smallest = j;
                    }
                }
                elementSwap(arr, i, smallest);
            }
        } else System.out.println("Array is already sorted");
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
//        Insert, Delete
        /*
        int size = arr.length;
        System.out.println("SIZE: " + size);
        System.out.print("Enter the value of element to be inserted: ");
        int element = sc.nextInt();
        System.out.print("Enter the index of the element to be inserted: ");
        int index = sc.nextInt();
        System.out.print("Original Array: ");
        printArray(arr, size);
        System.out.println();
        insertElement(arr, size, index, element);
        deleteElement(arr, size, index);
         */

//        Check if Array is Sorted
        /*
        boolean sorted = isSorted(arr);
        if (sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
         */
//        Merging two Arrays
        /*
        int[] arr1 = new int[5];
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        arr1[3] = 44;
        arr1[4] = 55;
        int[] arr2 = new int[arr.length + arr1.length];
        mergeArray(arr, arr1, arr2);
        */
//        Linear / Sequential Search
        /*
        System.out.print("Enter element to find from the array: ");
        int element = sc.nextInt();
        linearSearch(arr, element);
         */
//        Binary Search
        /*
        System.out.print("Enter element to find from the array: ");
        int element = sc.nextInt();
        binarySearch(arr, element);
        */
        // Bubble Sort
        /*
        int[] arr1 = {452, 524, 54, 51, 6, 7, 43, 985, 5, 6, 5, 96, 75, 785};
        bubbleSort(arr1);
        */
        // Selection Sort
        /*
        int[] arr2 = {452, 524, 54, 51, 6, 7, 43, 985, 5, 6, 5, 96, 75, 785};
        selectionSort(arr2);
        */
    }
}