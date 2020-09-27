'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/929/problem
'''
def manmohan_loves_pattern1(n):
    for row in range(1, n+1):
        if(row>1):
            print(1, end="")
            for col in range(0, row - 2):
                if row%2!=0: print(1, end="")
                else: print(0, end="")
            print(1, end="")
        else: print(1, end="")
        print()
if __name__ == "__main__":
    n = int(input().strip())
    manmohan_loves_pattern1(n)