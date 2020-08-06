def der(n):
  f = [1,0,1]
  for i in range(3,n+1):
    num = ((i-1)*(f[i-1]+f[i-2])) % 100000007
    f.append(num)
  return f[n]

n = int(input())
print(der(n))