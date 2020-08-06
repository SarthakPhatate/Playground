def time(F,B,T,D):
  d=0
  t=0
  i=1
  while(1):
    if i%2!=0:
      d+=B
      t+=B*T
    else:
      d-=F
      t+=F*T
    if(d>D):
      t-=(d-D)*T
      d=D
    if(d==D):
      break
    i+=1
  print(t)
  
n=input()
try:
    n=int(n)
    if (n > 0):
      for i in range(0,n):
        f,b,t,d = input().split(" ")
        f=int(f)
        b=int(b)
        t=int(t)
        d=int(d)
        if(f>=b or d == 0 or t == 0):
          print("Cannot park")
        else:
          time(f,b,t,d)
    else:
        print("Invalid test case")
except:
    print("Invalid test case")