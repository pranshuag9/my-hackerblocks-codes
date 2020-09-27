'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/67/problem
'''
MAX_SIZE = 1000005
primes = [0,2]
def sieve_of_eratosthenes():
    temp = [True if x%2 else False for x in range(0,MAX_SIZE)]
    temp[1], temp[2] = False, True
    for i in range(3, MAX_SIZE, 2):
        if(i*i<MAX_SIZE and temp[i] is True): 
            for j in range(i*i, MAX_SIZE, i): temp[j] = False
    for i in range(3, MAX_SIZE, 2): 
        if temp[i] is True: primes.append(i)

if __name__ == "__main__":
    sieve_of_eratosthenes()
    testcases = int(input())
    for testcase in range(testcases):
        n = int(input())
        print(primes[n])