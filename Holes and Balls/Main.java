n = int(input())
hole = list(map(int,input().split()))
m = int(input())
ball = list(map(int,input().split()))

ans = [0]*m
for i in range(n,0,-1):
  count = 0
  for j in range(len(ball)):
    if ball[j]<= hole[i-1] and ball[j]!=0:
      ans[j] = i
      ball[j] = 0
      count+=1
      if(count==i):
        break
  if(count==0):
    ball[j] = 0
print(*ans)