package practices.CFC_classWork.recursion;

public class Combination {
    public static void combinationWithRepitition(int[] arr, int target,int sum, String ans, int index){
        if (sum == target) {
            System.out.println(ans);
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(sum+arr[i] <= target){
                combinationWithRepitition(arr,target, sum+arr[i], ans+arr[i],i);
            }
        }
    }public static void combinationWithoutRepitition(int[] arr, int target,int sum, String ans, int index){
        if (sum == target) {
            System.out.println(ans);
            return;
        }
        for(int i = index; i < arr.length; i++){
            if(sum+arr[i] <= target){
                combinationWithRepitition(arr,target, sum+arr[i], ans+arr[i],i+1);
            }
        }
    }
    public static void combinations(){
        int []arr = {1,2,3,4};
        int target = 4;
        System.out.println("Combination With Repitition");
        combinationWithRepitition(arr,target,0,"",0);
        System.out.println("\nCombination Without Repitition");
        combinationWithoutRepitition(arr,target,0,"",0);
    }

    public static void main(String[] args) {
        combinations();
    }
}