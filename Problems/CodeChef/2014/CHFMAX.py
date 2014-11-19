# Problem: Count of Maximum (CHFMAX)
# Author: Michael Feliciano
# Goal: Give an input string print the string with "?" in place
# of the character with the greatest frequeny and lowest ascii value

# Approach: I found this problem with only a few minutes left in a contest it
# looked pretty easy so I coded a simple solution that iterates through the 
# sequence to count character frequencies and then stores then in a dictionary. 
# I then find the maximum frequency count of any character by checking the values
# of my dictionary. From there I populate a contenders list with the ordinal values
# of all characters occuring which allows me to easily find the character with the lowest
# ascii value by using min() and changing this min value back into its character
# representation. From there we make use of pythons regular expression library specifically
# the sub() which allows us to replace all occurances of a pattern with another pattern 
# which is in this case "?" 
 

import re

cases = int(raw_input())

for i in range(cases):

	seq = raw_input()
	freq_count = {}

	for char in seq:
		if(char in freq_count):
			freq_count[char]+=1
		else:
			freq_count[char] = 1

	max_count = max(freq_count.values())
	
	contenders = []
	
	for entry in freq_count:
		if(freq_count[entry] == max_count):
			contenders.append(ord(entry))


	lowest_char = chr(min(contenders))

	print re.sub(lowest_char,"?",seq)
