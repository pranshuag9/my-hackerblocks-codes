'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/231/problem
'''
def hollow_rhombus_pattern(n):
    row, start, end = 1, n, 2*n-1
    for row in range(1, n+1, 1):
        for col in range(1, end+1, 1):
            if (col >= start and (row == 1 or row == n or col == start or col == end)): print("*", end='')
            else: print(" ", end='')
        print()
        start -= 1
        end -= 1
n = int(input())
hollow_rhombus_pattern(n)