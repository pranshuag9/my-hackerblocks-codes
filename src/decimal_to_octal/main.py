'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/217/problem
'''
def decimal_to_octal(n):
    i, BASE, sum = 0, 8, 0
    while n > 0:
        rem = n % BASE
        sum += rem * (10**i)
        n = int(n / BASE)
        i += 1
    print(sum)
if __name__ == "__main__":
    n = int(input().strip())
    decimal_to_octal(n)