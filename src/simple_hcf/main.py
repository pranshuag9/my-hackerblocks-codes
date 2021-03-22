'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/738/problem
'''
import re
def gcdI(n1, n2):
    while n2 != 0: n2, n1 = n1 % n2, n2
    return n1
def gcd(arr):
    result = int(arr[0])
    for i in range(1, len(arr)): result = gcdI(result, int(arr[i]))
    return result
# Taking irregular testcases like a Scanner Class in java
def take_input(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return " ".join(arr)

if __name__ == "__main__":
    n = int(input().strip())
    arr = take_input(n).split()
    print(gcd(arr))