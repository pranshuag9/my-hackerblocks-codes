'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/232/problem
'''
def method1(n):
    for row in range(1, n + 1):
        if row > 1:
            print(row - 1, end = "")
            for col in range(0, row - 2): print(0, end = "")
            print(row - 1, end = "")
        else: print(row, end="")
        print()
def method2(n):
    first = 1
    print(first)
    for row in range(1, n):
        for col in range(1, row+2):
            if col == 1 or col == row+1: print(row, end="")
            else: print(0, end="")
        print()
if __name__ == "__main__":
    n = int(input().strip(" "))
    method1(n)