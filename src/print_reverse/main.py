'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/3/100/problem
'''
def print_reverse(num):
    i, j = 0, len(num) - 1
    while(i < int(len(num)/2)):
        num[i], num[j] = num[j], num[i]
        i += 1
        j -= 1
    for c in num:
        print(c, end="")
if __name__ == "__main__":
    num = list(input().strip())
    print_reverse(num)