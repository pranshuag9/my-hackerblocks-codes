'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/2/1366/problem
'''
import re
def reverse_using_for(arr):
    for i, j in zip(range(0, len(arr), 1), range(len(arr) - 1, 0, -1)):
        if i < j: arr[i], arr[j] = arr[j], arr[i]
def print_array(arr):
    for i in arr: print(i)
# Taking irregular testcases like a Scanner Class in java
def take_input(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return arr
if __name__ == "__main__":
    n = int(input().strip())
    arr = take_input(n)
    arr = [int(i) for i in arr]
    reverse_using_for(arr)
    print_array(arr)