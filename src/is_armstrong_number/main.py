'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1102/problem
'''
def is_armstrong_number(n):
    temp, pow = int(n), 0
    arr = [0 for _ in range(11)]
    while temp > 0:
        arr[pow] = temp % 10
        temp  = int(temp / 10)
        pow += 1
    size, sum = pow, 0
    for j in range(0, size): sum += (int(arr[j]**pow))
    return sum == n
if __name__ == "__main__":
    n = int(input().strip())
    if is_armstrong_number(n): print("true")
    else: print("false")