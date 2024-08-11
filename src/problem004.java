public class problem004 {
    public static void main(String[] args){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int m = nums1.length;
        int n = nums2.length;
        int[] ansSort = new int[m + n];
        double ans;
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0; i < m + n; i++){
            if(temp1 >= m){
                ansSort[i] = nums2[temp2];
                temp2++;
            } else if (temp2 >= n){
                ansSort[i] = nums1[temp1];
                temp1++;
            }else if (nums1[temp1] > nums2[temp2]){
                ansSort[i] = nums2[temp2];
                temp2++;
            }else{
                ansSort[i] = nums1[temp1];
                temp1++;
            }
        }
        int l = ansSort.length;
        if(l == 0){
            ans = 0;
        } else if (l % 2 == 0){
            ans = ((double)ansSort[(l / 2) - 1] + (double)ansSort[(l / 2)]) / 2;
        } else {
            ans =  ansSort[(l / 2)];
        }
        ansSort = null;

        System.out.println(ans);
    }
}
