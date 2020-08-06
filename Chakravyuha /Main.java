# Python program to fill a matrix with 
# values from 1 to n*n in spiral fashion. 

# Fills a[m][n] with values 
# from 1 to m*n in spiral fashion. 
def spiralFill(m, n, a):
	val = 1
	# k - starting row index 
	# m - ending row index 
	# l - starting column index 
	# n - ending column index 
	k, l = 0, 0
	while (k < m and l < n): 
		for i in range(l, n): 
			a[k][i] = val
			val += 1
		k += 1

		# Print the last column from the remaining columns. 
		for i in range(k, m): 
			a[i][n - 1] = val 
			val += 1
		n -= 1

		# Print the last row from the remaining rows. 
		if (k < m): 
			for i in range(n - 1, l - 1, -1): 
				a[m - 1][i] = val 
				val += 1
			m -= 1

		# Print the first column from the remaining columns. 
		if (l < n): 
			for i in range(m - 1, k - 1, -1): 
				a[i][l] = val 
				val += 1
			l += 1

# Driver program 
if __name__ == '__main__':
  n = int(input())
  pow_pon = list(range(11,n*n+1,11))
  a = [[0 for j in range(n)] for i in range(n)]
  spiralFill(n, n, a)
  pos = dict()
  for i in range(n):
    for j in range(n):
      print(a[i][j], end='\t')
      if(a[i][j] in pow_pon):
        if(j>0):
          pos[a[i][j]] = (i,j)
        else:
          pos[a[i][j]] = (i,j)
    print('')
  print('Total Power points : {}'.format(len(pow_pon)+1))
  print((0,0))
  for i in sorted(pos):
    print(pos[i])