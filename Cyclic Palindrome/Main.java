for _ in range(int(input())):
  s = input()
  s1=s
  s2=s
  if(len(set(s))==len(s)):
    print(-1)
  elif(s==s[::-1]):
    print(0)
  else:
    count=0
    t=0
    for i in range(len(s)//2):
      s1 = s1[-1] + s1[:-1]
      s2 = s2[1:] + s2[0]
      if(s2 == s2[::-1] or s1 == s1[::-1]):
        count+=1
        t=1
        break
      count+=1
    if(t==0):
      print(-1)
    else:
      print(count)