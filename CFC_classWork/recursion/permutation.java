package practices.CFC_classWork.recursion;

public class permutation {
    static int count = 0;
    public static void permutationWithRepitition(int[] arr, int target,int sum, String ans){
        if (sum == target) {
            System.out.println(ans);
            count++;
            return;
        }
        for(int i = 0; i < arr.length; i++){
            if(sum+arr[i] <= target){
                permutationWithRepitition(arr,target, sum+arr[i], ans+arr[i]);
            }
        }
    }
    public static void permutationWithRepitition(){
        int []arr = {1,2,3,4};
        int target = 4;
        permutationWithRepitition(arr,target,0,"");
    }

    public static void main(String[] args) {
        permutationWithRepitition();
        System.out.println("Total permutation: "+count);
    }
}

