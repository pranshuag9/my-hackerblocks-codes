'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/165/problem
 Algorithm:
 1. Put loop on string that will give substring of every length.
 2. Create a function that will return true if the passed number is a CB number else return false.
 3. To put a check if the digit is already a part of the any other CB number, create an boolean array say, valid which store which digits till now has been a part of any other CB number.
 4. Take a counter and increment if a CB number is found.
 5. Print the count.
'''
def isPrime(sub):
    if sub == 0 or sub == 1: return False;
    prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    for i in range(0, len(prime)):
        if sub == prime[i]: return True
    for i in range(0, len(prime)):
        if sub % prime[i] == 0: return False
    return True
def isValid(visited, str, start, end):
    for i in range(start, end):
        if visited[i]: return False
    return True
def countCBnumbers(N, str):
    cnt, visited = 0, [False for _ in range(N)]
    for len in range(1, N + 1):
        for start in range(N - len + 1):
            end = start + len
            sub = str[start : start + len]
            if isPrime(int(sub)) and isValid(visited, str, start, end):
                for i in range(start, end): visited[i] = True
                cnt += 1
    return cnt
if __name__ == "__main__":
    N = int(input())
    str = input()
    print(countCBnumbers(N, str))