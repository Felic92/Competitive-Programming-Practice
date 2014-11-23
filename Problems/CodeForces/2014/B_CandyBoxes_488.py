
def main():
	
	candyList = []
	numCandies = int(raw_input())

	for i in range(numCandies):
		candy = int(raw_input())
		candyList.append(candy)

	#Sorting required for downstream preconditions to hold
	candyList = sorted(candyList)	

	#We will take different approaches based on value of numCandies
	solution = solve(numCandies,candyList)

	if(solution[0] == "NO"):
		print "NO"
	else:
		for element in solution:
			print element

def solve(numCandies,cList):
	
	result = []

	if(numCandies == 0):
		result.extend(("YES",1,1,3,3))

	elif(numCandies == 1):
		result.extend(("YES",cList[0],cList[0],3*cList[0],3*cList[0]))

	elif(numCandies == 2):
		#TODO
		print "yes"

	elif(numCandies == 3):
		#TODO
		print "yes"

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
	return (cList[1]+cList[2])/2

# Returns the range of the input list
# Precondition: Input list MUST be sorted
# Alternative for unsorted list [ return max(list) - min(list) ]  
def numericalRange(cList):
	return cList[-1] - cList[0]


main()
