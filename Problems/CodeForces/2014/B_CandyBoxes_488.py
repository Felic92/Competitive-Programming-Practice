from __future__ import division

def main():
	
	candyList = []
	numCandies = int(raw_input())

	for i in range(numCandies):
		candy = int(raw_input())
		candyList.append(candy)

	#We will take different approaches based on value of numCandies
	solution = solve(numCandies,candyList)

	if(len(solution) == 0 or solution[0] == "NO"):
		print "NO"
	else:
		for element in solution:
			print element

def solve(numCandies,cList):
	
	result = []

	if(numCandies == 0):
		result = ["YES",1,1,3,3]

	elif(numCandies == 1):
		result = ["YES",cList[0],3*cList[0],3*cList[0]]

	elif(numCandies == 2):
		x = min(cList)
		y = max(cList)

		if(3*x < y):
			result.append("NO")
		else:
			#Yarr! Here be sorcery!
			result = ["YES", 4*x-y, 3*x]
	
	elif(numCandies == 3):

		cList.append(1)

		for x in range(1,501):
			cList[-1] = x
			if(check(cList) == "YES"):
				result = ["YES",x]
				break

	else:
		result.append(check(cList))

	return result


# Check is values of mean,median and range
# are equivalent given an input list 
def check(cList):
	if(mean(cList) == median(cList) == numericalRange(cList)):
		return "YES"
	else:
		return "NO"

# Returns the mean of the input list
# Input list is not required to be sorted
def mean(cList):
	return sum(cList)/len(cList)


#Returns the median of a 4 element list
#Precondition: Input list must be sorted
def median(cList):
	cList = sorted(cList)
	return (cList[1]+cList[2])/2

# Returns the range of the input list
def numericalRange(cList):
	return max(cList) - min(cList)


main()
