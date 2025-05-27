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

//🚀 Dutch National Flag Algorithm
// The dutch national flag algorithm involves sorting the nums array by partitioning it into 3 segments.
// nums[0]...nums[low - 1] : This part should consist of all zeroes.
// nums[low]...nums[mid - 1] : This part should consist of all ones.
// nums[mid]...nums[end of array] : This part should consist of all twos.
// Here is how the 3 segments look like →


// We basically look for 3 possible cases for 3 values of mid here,
// 1️⃣ Case 1 → Value of mid is 0
// Swap it with low because we want all 0's to be before mid.
// 2️⃣ Case 2 → Value of mid is 1
// Increment mid because 1 is at the correct position it should be.
// 3️⃣ Case 3 → Value of mid is 2
// We swap it with high because we want all 2's to be after high.
// image.png

// 🕒 Time Complexity: O(n)
// 💾 Space Complexity: O(1)
    