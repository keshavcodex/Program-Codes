package cfcAssignment2;

import java.util.Arrays;

public class Q12 {
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    static boolean isOdd(int a){
        if((a & 1) == 1){
            return true;
        }
        return false;
    }
    public static void sortOddEven(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (isOdd(arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(!isOdd(arr[j])){
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {3,8,5,13,6,12,17,51,48548,83,4461,158};
        System.out.println(Arrays.toString(arr));
        sortOddEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
