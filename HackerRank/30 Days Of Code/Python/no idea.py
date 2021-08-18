a = input().split()
a = map(int, a)
n = map(int,input().split())
A = set(map(int, input().split()))
B = set(map(int, input().split()))
counter = 0
for i in n:
    if i in A:
        counter+=1
    elif i in B:
        counter -=1
print(counter)
