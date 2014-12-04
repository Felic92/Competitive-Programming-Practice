# Problem A Vasaya and Football
# Author: Michael Feliciano
# Goal: Given two teams and the cards given during a game output the first
# distinct red card recieved by each player and at what time the card occured.
# Note two yellow card == one red card

# Approach: Since we are given all data on cards given during the game we can 
# solve this problem by maintaining multiple lists. Frist we take a line from
# input if the card is red we can output all the required information and append# that player number the list that stores that teams players who are no longer
# in play. If the card is yellow they go a list of their teammates who have also# recieved yellow. Before adding a player who has a yellow to this list we check# to see if they are already in the list if they are they re given a red card
# for accruing 2 yellows. We print their info in this case and append them to 
# the out of play list. 

# Difficulty: Easy
# Tags: Implementation 
# Problem Link: http://codeforces.com/problemset/problem/493/A

def main():

	homeName = raw_input()
	awayName = raw_input()

	teamHome = []
	teamAway = []

	outOfPlayHome = []
	outOfPlayAway = []

	output = []

	numFouls = int(raw_input())

	for i in range(numFouls):
		minute, team, playerNum, card = raw_input().split()

		if(team == 'h' and playerNum not in outOfPlayHome):

			if(card == 'r'):
				outOfPlayHome.append(playerNum)
				output.append('%s %s %s' % (homeName,playerNum,minute))

			elif(playerNum in teamHome):
				outOfPlayHome.append(playerNum)
				output.append('%s %s %s' % (homeName,playerNum,minute))
			else:
				teamHome.append(playerNum)

		if(team == 'a' and playerNum not in outOfPlayAway):

			if(card == 'r'):
				outOfPlayAway.append(playerNum)
				output.append('%s %s %s' % (awayName,playerNum,minute))

			elif(playerNum in teamAway):
				outOfPlayAway.append(playerNum)
				output.append('%s %s %s' % (awayName,playerNum,minute))
			else:
				teamAway.append(playerNum)

	for element in output:
		print element

main()

