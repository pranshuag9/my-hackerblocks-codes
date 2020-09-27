'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/919/problem
'''
def check_prime(n):
    if n < 2: return False
    primes = [True if x%2 else False for x in range(0, n+1)]
    primes[1], primes[2] = False, True
    for i in range(3, n+1, 2):
        if i*i<n and primes[i] is True:
            for j in range(i*i, n+1, i): primes[j] = False
    return primes[n]

if __name__ == "__main__":
    n = int(input())
    if check_prime(n): print("Prime")
    else: print("Not Prime")