'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/571/problem
'''
def pattern_mountain(n):
    start, mid, last = 0, n - 1, 2 * n - 1
    for row in range(start, mid + 1):
        for col in range(start, last):
            if(col <= mid and col <= row): print(f"{col + 1}\t", end='')
            elif(col > mid and col >= -row + 2 * mid): print(f"{2 * mid - col + 1}\t", end='')
            else: print(f" \t", end='')
        print()
if __name__ == "__main__":
    n = int(input().strip())
    pattern_mountain(n)