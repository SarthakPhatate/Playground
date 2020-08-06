def pattern(n):
  list_ = list(range(1,n*(n+1)+1))
  i=0
  for j in range(n,0,-1):
    print('*'*i,end="")
    t = list_[:j]+list_[-j:]
    p = [str(x * 10) for x in t[:-1]] + [str(t[-1])]
    print("".join(p))
    list_=list_[j:-j]
    i+=2
    
n = int(input())
pattern(n)