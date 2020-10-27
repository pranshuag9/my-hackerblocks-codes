'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/189/problem
'''
def pattern_triangle(n):
    start, mid, last = 0, n - 1, 2 * n - 1
    for row in range(mid + 1):
        result = row + 1
        for col in range(last):
            if (col <= mid and col >= -row + mid) or (col > mid and col <= row + mid):
                print(f"{result}\t", end='')
                if col < mid: result += 1
                else: result -= 1
            else: print(" \t", end='')
        print()
if __name__ == "__main__":
    n = int(input().strip())
    pattern_triangle(n)