from itertools import combinations_with_replacement
def prime_numbers(n):
  list_ = []
  for i in range(2,n+1):
    for j in range(2, (i//2)+1):
      if (i % j) == 0:
        break
    else:
      list_.append(str(i))
  return list_
  
def isprime(n):
  for j in range(2, (n//2)+1):
    if (n % j) == 0:
      return 0
  else:
    return 1

n = int(input())
if n>1:
  ans = set()
  count = 0
  prime_num = prime_numbers(n)
  for i in list(combinations_with_replacement(prime_num, 2)):
    if(isprime(int("".join(i)))):
      ans.add(int("".join(i)))
    if(i[0]!=i[1]):
      if(isprime(int("".join(i[::-1])))):
        ans.add(int("".join(i[::-1])))
  print(len(ans))
else:
  print(1)