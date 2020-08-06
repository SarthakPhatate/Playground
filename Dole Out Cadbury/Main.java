min_len = int(input())
max_len = int(input())
min_wid = int(input())
max_wid = int(input())

list_ = []
for i in range(min_len, max_len+1):
  for j in range(min_wid, max_wid+1):
    list_.append([i,j])

total_cad = 0
for i in list_:
  while(1):
    if(sum(i)==0):
      break
    if(i[0] == i[1]):
      i = [0,0]
    else:
      if(i[0] > i[1]):
        i = [i[0]-i[1],i[1]]
      else:
        i = [i[0],i[1]-i[0]]
    total_cad = total_cad + 1

print(total_cad)