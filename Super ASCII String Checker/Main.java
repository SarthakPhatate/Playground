for _ in range(int(input())):
  s = input()
  t=0
  for i in set(s):
    c = s.count(i)
    #print(count,ord(i)-96,sep=" ")
    if(ord(i)-96 != c):
      print('NO',end=" ")
      t=1
      break
  if(t==0):
    print('YES',end=" ")