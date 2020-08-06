def winner(zombies, max_t, zom_eng, int_eng, min_eng):
  if(zombies > max_t):
    return "NO"
  zom_eng.sort()
  for i in zom_eng:
    if(i < int_eng):
      int_eng = int_eng + (int_eng - i)
  if(int_eng >= min_eng):
    return "YES"
  else:
    return "NO"
  
for _ in range(int(input())):
  zombies, max_t = map(int,input().split())
  zom_eng = list(map(int,input().split()))
  int_eng, min_eng = map(int,input().split())
  print(winner(zombies, max_t, zom_eng, int_eng, min_eng),end="")