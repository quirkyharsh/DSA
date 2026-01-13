class Solution:
	def twoSum(self, arr, target):
		# code here
		arr.sort()
		
		left, right = 0, len(arr) - 1
		curr_sum = 0
		
		while(left < right):
		    curr_sum = arr[left] + arr[right]
		    
		    if(curr_sum == target):
		        return True
		        
		    elif curr_sum <= target:
		        left += 1
		        
		    else:
		        right -= 1
		        
		        
	    return False