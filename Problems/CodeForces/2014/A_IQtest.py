# Problem A. IQ Test 
# Author: Michael Feliciano
# Goal: A list of integers should either be all even or all odd. The given list
# is close but has one value that is not like the others find this value and
# report its index.

# Example Case Below
# 2 4 7 8 10   result: 3

# Approach: This problem is straight forward and the constrains are small making# almost all correct approaches feasible and making bruteforce pretty desirable.# I chose to use python list compression to create a new list from the input 
# such that the elements will be 0 if the value was even and 1 if the value was
# odd using this we can then compare the counts of evens versus odds. Since we
# know only one value differs in regards to parity the comparison of counts 
# will always tell us if even or odd is the outlier. From there since there is
# only one value with this parity we can use pythons .index() which seeks the
# first ocurance of a given value and returns the associated index.

# Difficulty: Very Easy
# Brute Force, Beginner 
# Problem Link: http://codeforces.com/problemset/problem/25/A

def main():

	numTasks = int(raw_input())

	numbers = map(int,raw_input().split())

	#List compression 0 represnts odd, 1 represents even
	checkEven = [x%2 for x in numbers]
	
	# Check if more odds exist than evens
	if(checkEven.count(1) > checkEven.count(0)):
		print checkEven.index(0)+1
	else:
		print checkEven.index(1)+1


main()



