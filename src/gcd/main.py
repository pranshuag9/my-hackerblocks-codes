'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/6/1040/problem
'''

def gcd(n1, n2):
    while n2 != 0:
        (n1, n2) = (n2, n1 % n2)
    return n1

n1 = int(input())
n2 = int(input())

print(gcd(n1, n2))
