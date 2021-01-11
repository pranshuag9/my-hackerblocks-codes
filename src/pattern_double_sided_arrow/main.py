'''
    @author Pranshu Aggarwal
    @problem https://hack.codingblocks.com/app/practice/1/75/problem
 '''
def pattern_double_sided_arrow(n):
    last, nsp1, nn1, nsp2, nn2, mid = n, n - 1, 1, 0, 1, int((n + 1) / 2)
    for row in range(1, n + 1, 1):
        sum = 1
        for col in range(1, 2 * n + 1 + 1, 1):
            if (col > nsp1 and (col <= nn1 + nsp1)):
                print((last - col + 1), end = ' ')
            elif (((col >= nsp1 + nn1 + nsp2) and (col < nsp1 + nn1 + nsp2 + nn2))):
                print(sum, end = ' ')
                sum += 1
            elif ((col <= nsp1) or (col < nn1 + nsp1 + nsp2) and (col > nn1 + nsp1)):
                print(" ", end = ' ')
        print()
        nsp1 = nsp1 - 2 if row < mid else nsp1 + 2
        nn1 = nn1 + 1 if row < mid else nn1 - 1
        last = last - 1 if row < mid else last + 1
        nsp2 = nsp2 + 2 if row < mid else nsp2 - 2
        nn2 = nn2 + 1 if row < mid else nn2 - 1
if __name__ == "__main__":
    n = int(input().strip())
    pattern_double_sided_arrow(n)