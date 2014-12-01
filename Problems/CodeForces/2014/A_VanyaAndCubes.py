# Problem: A. Vanaya And Cubes
# Author: Michael Feliciano
# Goal: Given a number of block and rule for consecutive level
# construction determine how many full levels can be created

# Approach: My initial thought was to precompute the sums of the 
# triangle numbers until the sum exceeded 10**4 (I belive there are 
# only 83) then binary search to list to return an insertion index
# which would intern give us the maximum number of whole levels which
# could be constructed. After looking a the constraints a secont time
# I deemed that method wasn't required to pass the time limit. So
# I ended up just keeping arunning sum and bruteforcing each case.

# Difficulty: Very Easy
# Tags: Basic Math
# Problem Link: http://codeforces.com/contest/492/problem/A 


def main():

	cubes = int(raw_input())

	maxLevels = 1
	sumOfCubes = 1
	while(sumOfCubes <= cubes):
		maxLevels+=1
		sumOfCubes += calcTriangleNumber(maxLevels)

	print maxLevels-1

def calcTriangleNumber(n):
	return (n*(n+1))/2


main()