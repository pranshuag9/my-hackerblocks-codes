'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/219/problem
'''
def binary_to_decimal(binary):
    arr = [0 for x in range(11)]
    i, decimal = 1, 0
    while(binary != 0):
        rem = binary % 10;
        binary = int(binary/10)
        arr[i] = rem
        i += 1
    size = i
    for j in range(1, size):
        if(arr[j] == 1):
            a = int(2**(j-1))
            decimal += a
    return decimal

if __name__ == "__main__":
    testcases = int(input())
    for testcase in range(testcases):
        binary = int(input())
        decimal = binary_to_decimal(binary)
        print(decimal)
