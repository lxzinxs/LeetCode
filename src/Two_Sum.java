import java.util.Arrays;

//LeetCode
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}

//Teste na IDE
public class Two_Sum {
    public static void main(String[] args) {
        Solution solucao = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] resultado = solucao.twoSum(nums, target);

        System.out.println("Índices encontrados: " + Arrays.toString(resultado));
    }
}