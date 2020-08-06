def winner(bob, zom_eng):
  zom_eng.sort()
  for i in zom_eng:
    bob = bob - (i%2) - (i//2)
  if(bob<0):
    return "NO"
  else:
    return "YES"
  

bob, _ = map(int,input().split())
zom_eng = list(map(int,input().split()))
print(winner(bob, zom_eng))
