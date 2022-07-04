package Soutions;

import java.util.Arrays;

public class SortingOrderArray {
    public static void main(String[] args) {
        int[] nums1={2,0};
        int[] nums2={1};
        merge(nums1,1,nums2,1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1=m-1; // pointer for nums1
        int p2=n-1; // pointer for nums2
        int i=nums1.length-1;
        while (p1>=0 && p2>=0){
            if(nums2[p2]>=nums1[p1]){
                nums1[i--]=nums2[p2--];
            }else {
                nums1[i--]=nums1[p1--];
            }
        }

        while (p1>0 ){
            nums1[i--]=nums1[p1--];
        }
        while (p2>=0){
            nums1[i--]=nums2[p2--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeAnotherWay(int[] nums1 , int m , int[] nums2 , int n){
        // nums1=[1,2,3,0,0,0]   m=3   i
        // nums2=[2,5,6]         n=3   j
        // newArr=[n+m]
//        [0,0,0]     [5,6]
        // [1,2,2,3]
        int[] newArr= new int[n+m];
        //System.out.println(Arrays.toString(nums1));
        int i=0,j=0,k=0;
        while (i<m && j<n ){
            if(nums1[i]<=nums2[j]){
                newArr[k++]=nums1[i++];
            }else if(nums2[j]<nums1[i]){
                newArr[k++]=nums2[j++];
            }
        }
        while (i<m){
            newArr[k++]=nums1[i++];
        }
        while (j<n){
            newArr[k++]=nums2[j++];
        }
        nums1=newArr;
        System.out.println(Arrays.toString(nums1));
    }
}
