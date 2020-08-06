n ,k = map(int, input().split())
j = 1
num = n
t=0
for i in range(n//2, 0, -1):
  if(j!=k):
    if(n%i==0):
      num = i
      j+=1
  else:
    t=1
    print(num)
    break

if(t==0):
  print(1)