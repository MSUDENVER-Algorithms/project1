def recursive_sums(sums_to_n, n):
  #sumsToN is an array length n initialized to 1
  if len(sums_to_n) == 1:
    sums_to_n[0] = n
    print(*sums_to_n)

  else:
    print(*sums_to_n, sep=" + ")
    if len(sums_to_n) > 1:
      sums_to_n.pop()
      sums_to_n.pop()
      i = n - len(sums_to_n)
      if i > 0:
        sums_to_n.append(i)
    recursive_sums(sums_to_n, n)

def recursive_twos(two_sums, n):
  if len(two_sums) == 2:
    print(*two_sums, sep=" + ")

  else:
    print(*two_sums, sep=" + ")

n = 7
my_list = []
for i in range(n):
  my_list.append(1)

recursive_sums(my_list, n)