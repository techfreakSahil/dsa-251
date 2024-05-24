package BinarySearch.FindFirstAndLastElementInaSortedArray;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        int start=Binsearch(nums,target,true);
        int end=Binsearch(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public int Binsearch(int[]arr,int target, boolean FindStartIndex){
        int ans=-1;
	int s=0;
	int e=arr.length-1;
	while(s<=e){
		int mid=s+(e-s)/2;
		if(target>arr[mid]){
			s=mid+1;

}
		else if(target<arr[mid]){
			e=mid-1;
}		
		else{
            ans=mid;
            if(FindStartIndex){
                e=mid-1;
            }
			else{
                s=mid+1;
            }
}
}
return ans;
}
}
