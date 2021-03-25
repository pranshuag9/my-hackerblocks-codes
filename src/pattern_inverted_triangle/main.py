'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/214/problem
 Algorithm(start, end):
 1. if start > end, then return
 2. Recursively Increment start by 1
 3. This condition is executed when increasing stack of recursion is filled upto end, and now starts printing, so
         for i:=0 to start step by 1, print("*\t")
 4. print(newline)
'''
import re
def pattern_inverted_triangle(start, last):
    if start > last: return
    pattern_inverted_triangle(start + 1, last)
    for _ in range(0, start): print("*\t", end='')
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
    pattern_inverted_triangle(0, n)    