'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1039/problem
'''
MAX_SIZE = 1000005
primes = [True if i%2==1 else False for i in range(MAX_SIZE)]
primes[1], primes[2] = 0, 1
def sieve_of_eratosthenes():
    for i in range(3, len(primes), 2): primes[i] = True
    for i in range(3, len(primes), 2):
        if (i * i < len(primes)) or (primes[i] is True):
            for j in range(i * i, len(primes), i): primes[j] = False 
def prime_visits(a, b):
    result = 0
    for i in range(a, b + 1, 1):
        if primes[i]: result += 1
    return result
if __name__ == "__main__":
    sieve_of_eratosthenes()
    testcases = int(input().strip())
    for testcase in range(testcases):
        arr = [int(i) for i in input().split(" ")]
        print(prime_visits(arr[0], arr[1]))