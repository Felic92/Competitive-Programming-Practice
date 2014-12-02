# Problem: B Vanya and Lanterns
# Author: Michael Feliciano
# Goal: Given a street which is a straight line beginning at coordinate 0 and ending at L along with
# a list of lanterns at various positions on the street determine the minimum light radius required
# to ensure the entire street is lit. 

# Approach: My first thought was to use chose a starting radius maybe the max distance between lanterns
# then use binary search to approximate the value halving the radius if it overly lit the street and
# doubling it if it didn't quite light the street. Then ending the search after the difference between
# the current value and an error term was less than a threshold. While this was a good first thought
# inspecting the problem further it became apparent that I could also find the answer by sorting the
# given list of lanterns in non decreasing order then finding the inter lantern distances between then.
# With that value stored I could then find the distances between the first lantern and the beginning of
# the road and the last lantern and the end of the road. This left me with all the required components
# to generate the correct answer. I would do this by finding the max of the greatest inter lantern
# distance divided by 2 (to account for 2 lanterns being able to meet each other half way) and the
# max of the gap between the first lantern and the beginng vs the last lantern and the end of the road.

# Seen below it looks like this : max(maxDist/2,max(lanterns[0], streetLength-lanterns[-1]))

# Difficulty: Medium
# Tags: Sorting
# Problem Link: http://codeforces.com/contest/492/problem/B

from __future__ import division

def main():

	numLanterns, streetLength = map(int,raw_input().split())

	lanterns = sorted(map(int,raw_input().split()))


	maxDist = 0
	for i in range(len(lanterns)-1):

		interLanternDist = lanterns[i+1] - lanterns[i]

		if(maxDist < interLanternDist):
			maxDist = interLanternDist

	print '%.10f' % max(maxDist/2,max(lanterns[0], streetLength-lanterns[-1]))


main()

