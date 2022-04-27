import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // tmp[0] = nums[i];
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            check(nums, left, right, i);
        }
        return res;
    }

    private void check(int[] arr, int left, int right, int i) {
        while (left < right) {
            if (arr[i] + arr[left] + arr[right] == 0) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(arr[i]);
                tmp.add(arr[left]);
                tmp.add(arr[right]);
                System.out.println(tmp.toString());
                res.add(tmp);
                while (left < right && arr[left] == arr[left+1]) {
                    left++;
                    System.out.println(left);
                }
                while (left < right && arr[right] == arr[right-1]) right--;
//                System.out.println(right);
                left++;
                right--;
//                break;
            } else if (arr[i] + arr[left] + arr[right] < 0) {
                left++;
            } else {
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {0,0,0,0,0};
        Solution ha = new Solution();
        ha.threeSum(test);
        System.out.println(ha.res.toString());
    }
}