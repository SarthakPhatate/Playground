def num_in_range(list_, ranges):
  count = 0
  for i in list_:
    if(i > ranges[1]):
      return count
    elif(i >= ranges[0] and i <= ranges[1]):
      count +=1
    else:
      pass
  return count

s, r = map(int,input().split())
list_ = [int(x) for x in input().split()]
list_.sort()
for _ in range(r):
  print(num_in_range(list_, [int(y) for y in input().split()]),end=" ")