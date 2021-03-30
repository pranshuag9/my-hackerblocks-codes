'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1051/problem
'''
import re
def takeInput(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return " ".join(arr).strip()
def canPiyushTravel(N, M, K, S):
    for i in range(0, N):
        if S > K:
            string = takeInput(M).split()
            for j in range(0, M):
                ch = string[j]
                if ch is '#': break
                if ch is '.': S -= 2
                else: S += 5
                if j is not M - 1: S -= 1
        else: break
    return S
if __name__ == "__main__":
    string = takeInput(4).split()
    N, M, K, S = int(string[0]), int(string[1]), int(string[2]), int(string[3])
    S = canPiyushTravel(N, M, K, S)
    if S > K: print(f"Yes\n{S}")
    else: print("No")