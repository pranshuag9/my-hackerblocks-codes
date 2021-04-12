'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/dcb/289
'''
import re
def fib(n):
    a, b, c = 0, 1, 0
    if n is 0 or n is 1: return n
    while n - 1 > 0:
        c = a + b
        a, b, n = b, c, n - 1
    return c
def takeInput(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(" +", " ", line)
        arr.extend(line.split())
    return " ".join(arr).strip()
if __name__ == "__main__":
    n = int(takeInput(1))
    print(fib(n))