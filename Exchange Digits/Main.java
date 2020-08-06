from itertools import permutations
a, b = map(int,input().split())
a = list(str(a))
a = permutations(a)
ans = []
for i in a:
  num = int("".join(i))
  if(num>b):
    ans.append(num)
if(len(ans)!=0):
  print(min(ans))
else:
  print(-1)