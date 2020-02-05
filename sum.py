def sums_to_n(n):
	#list length n inititalized to zero
	sum_list = [0] *n
	
	#index of last integer in sum
	i = 0
	
	#initialize first element as n (n + 0 = n)
	sum_list[i] = n
	
	#loop stops when sum_list is all ones
	while True:
		
		#print current sum_list TODO: need to stop at first 0
		print(*sum_list, sep=" + ")
		
		#left_over tracks the value left over
		left_over = 0
		
		#loop from the end of the list to the first value > 1
		while i >= 0 and sum_list[i] == 1:
			left_over += sum_list[i]
			i -= 1
			
		#if we've looped through the list and each value is 1, we're done
		if i < 0:
			return
		
		#decrease the current element and increase left_over
		sum_list[i] -= 1
		left_over += 1
			
		#sort and adjust left_over
		while left_over > sum_list[i]:
			sum_list[i + 1] = sum_list[i]
			left_over = left_over - sum_list[i]
			i += 1
			
		#load left_over into sum_list and increment index
		sum_list[i + 1] = left_over
		i += 1
		
print_sums_to_n(7)
		
	
	