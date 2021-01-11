'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/2/1366/problem
'''
def reverseUsingFor(arr):
    for i, j in zip(range(0, len(arr), 1), range(len(arr) - 1, 0, -1)):
        if i < j: arr[i], arr[j] = arr[j], arr[i]
def printArray(arr):
    for i in arr: print(i)
if __name__ == "__main__":
    n = int(input())
    arr = [int(i) for i in input().split()]
    reverseUsingFor(arr)
    printArray(arr)