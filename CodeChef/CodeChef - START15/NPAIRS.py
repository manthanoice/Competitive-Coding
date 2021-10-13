#Well why not use some py when you've learned py :P

from collections import defaultdict
t = int(input())
while(t!=0):
    n = int(input())
    s = list(map(int, list(input())))
    d=defaultdict(int)
    d1=defaultdict(int)
    for i in range(n):
        d[s[i]+i]+=1
        d1[s[i]-i]+=1
    p1 = 0
    p2 = 0
    for i in d.values():
        p1 += (i*(i-1)//2)
    for i in d1.values():
        p2 += (i*(i-1)//2)
    answer = p1+p2
    print(answer)
    t-=1
