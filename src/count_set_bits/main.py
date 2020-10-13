'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/104/problem
'''
def decimal_to_binary_ones_count(n):
    count = 0
    while(n != 0):
        rem = n % 2
        n = int(n / 2)
        if rem == 1: count += 1
    return count
if __name__ == "__main__":
    testcases = int(input().strip())
    for _ in range(testcases):
        n = int(input().strip())
        print(decimal_to_binary_ones_count(n))