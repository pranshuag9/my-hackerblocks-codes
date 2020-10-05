'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/853/problem
'''
def odd_and_even_back_in_delhi(n):
    even, odd = 0, 0
    while n != 0:
        rem = n % 10
        if rem % 2 == 0: even += rem
        else: odd += rem
        n = int(n / 10)
    return (even % 4 == 0 or odd % 3 == 0)
if __name__ == "__main__":
    testcases = int(input().strip())
    for testcase in range(testcases): print("Yes" if odd_and_even_back_in_delhi(int(input().strip())) else "No")