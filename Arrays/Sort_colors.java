import java.util.*;
// optimal
// Dutch National Flag Problem

public  class Sort_colors{
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else{
            int temp=nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp;

            high--;
        }
    }
// }
// }

//Brute force

Arrays.sort(nums);
  // Time Complexity: O(nlogn)
//   Space Complexity: O(1)
// }
//}

//Better

int c0=0,c1=0,c2=0;

for(int i=0;i<nums.length;i++)
{
    if(nums[i]==0) c0++;
    else if(nums[i]==1) c1++;
    else c2++;
}

       for (int i = 0; i < c0; i++) nums[i]=0; 
        for (int i = c0; i < c0 + c1; i++) nums[i]=1; 
        for (int i = c0 + c1; i < nums.length; i++) nums[i]=2;
    }
}
