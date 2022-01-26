if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    arr = sorted(arr)
    new_arr = []
    for i in arr:
        if i not in new_arr:
            new_arr.append(i)
    print(new_arr[-2])
