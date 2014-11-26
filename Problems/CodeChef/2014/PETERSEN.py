



a0 = {'E':4,'B':1,'A':5}

a5 = {'A':0,'D':8,'C':7}

b1 = {'A':0,'B':6,'C':2}

b6 = {'B':1,'E':9,'D':8}

c2 = {'B':1,'C':7,'D':3}

c7 = {'C':2,'A':5,'E':9}

d3 = {'D':8,'C':2,'E':4}

d8 = {'D':3,'A':5,'B':6}

e4 = {'E':9,'D':3,'A':0}

e9 = {'E':4,'C':7,'B':6}


cases = int(raw_input())


for i in range(cases):
	seq = raw_input()

	# please lexicographically smaller one first
	# so we start by checking if walk from smallest
	# is possible
	A = [a0,a5]
	B = [b1,b6]
	C = [c2,c7]
	D = [d3,d8]
	E = [e4,e9]

	nodes = {'A':A,'B':B,'C':C,'D':D,'E':E}
	possible = True
	sequence = ""

	#can we reach next from current
	current = seq[0]
	for j in range(1,len(seq)):
		print seq[j-1]
		print nodes[seq[j-1]]

		# we are good for 2 steps ahead
		if(seq[j-1] in nodes[seq[j-1]][0] and ( seq[j] in nodes[seq[j]][0] or seq[j] in nodes[seq[j]][1]):
			sequence.append() #wahtever the count of the first letter is
				
	
			
				
		
		
	








