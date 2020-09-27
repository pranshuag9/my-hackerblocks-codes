'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/54/problem
'''
def r2_pattern_recursive(n):
    if n < 1: return
    if n % 2 is not 0: print(n)
    r2_pattern_recursive(n-1)
    if n % 2 is 0: print(n)

def r2_pattern_iterative(n):
    for i in range(n, 0, -1):
        if i % 2 != 0: print(i)
    for i in range(2, n+1, 1):
        if i % 2 == 0: print(i)

if __name__ == "__main__":
    n = int(input().strip())
    r2_pattern_iterative(n)
#     r2_pattern_recursive(n)