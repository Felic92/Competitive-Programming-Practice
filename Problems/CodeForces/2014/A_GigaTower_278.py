# Problem: A Giga Tower
# Author: Michael Feliciano
# Goal: Given a number a determine the distance to the next number containing
# at least one 8. Moves are only allowed in the positive direction

# Approach: Normally problems are not as easy as they appear but this one was.
# I simply read in the number initialized a counter variable with the value 1 
# (to consider values atleast 1 greater than a ) from there since the distance 
# to a value containing 8 will always be relatively small I simply bruteforced
# continuosly incrementing my couter until I found that the sum of my counter 
# and my original value a contained an 8. At that point the correct result
# was stored in my counter variable and ready to be printed. 

# Difficulty: Very Easy
# Tags: Math, Brute Force
# Problem Link: http://codeforces.com/contest/488/problem/A

a = int(raw_input())
cnt = 1

while("8" not in str(a+cnt)):
	cnt+=1

print cnt
