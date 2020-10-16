'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/484/problem
'''
def pattern_with_zeros(n):
    for row in range(1, n + 1):
        for col in range(1, row + 1):
            if (col == 1) or (col == row): print(row, end = '')
            else: print(0, end = '')
            print("\t", end = '')
        print()
if __name__ == "__main__":
    n = int(input().strip())
    pattern_with_zeros(n)