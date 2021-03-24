'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/282/problem
'''
import re

def r3_pattern2(n):
    sum = 1
    for row in range(1, 2 * n):
        if row % 2 == 1:
            for col in range(1, sum + 1): print("*", end='')
            sum += 1
        print()

# Taking irregular testcases like a Scanner Class in java
def take_input(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return " ".join(arr).strip()

if __name__ == "__main__":
    n = int(take_input(1))
    r3_pattern2(n)