'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/170/problem
'''
def ultra_fast_mathematician(arr):
    str1, str2, result = arr[0], arr[1], ""
    for i in range(0, len(arr[0]), 1): result += str(eval(str1[i]) ^ eval(str2[i]))
    return result
if __name__ == "__main__":
    testcases = int(input().strip())
    for testcase in range(testcases): print(ultra_fast_mathematician(input().strip().split(" ")))