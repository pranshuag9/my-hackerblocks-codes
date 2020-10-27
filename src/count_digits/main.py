'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/64/problem
'''
def count_digits(n, digit):
    count = 0
    while n != 0:
        if (n % 10) is digit: count += 1
        n = int(n / 10)
    return count
if __name__ == "__main__":
    n = int(input().strip())
    digit = int(input().strip())
    print(count_digits(n, digit))