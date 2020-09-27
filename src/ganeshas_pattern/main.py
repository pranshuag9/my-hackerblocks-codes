'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/6/1055/problem
'''
def ganesha_pattern(n):
    if n%2 == 1:
        start, mid, end = 1, int((n+1)/2), n
        for row in range(1, n+1):
            for col in range(1, n+1):
                if row == mid:
                    print("*", end='')
                    continue
                if((row<mid and ((col==start) or (col>mid and row==start))) or (row>mid and ((col<mid and row==end) or (col>mid and col==end)))):
                    print("*", end='')
                elif((row>mid or row<mid) and col==mid): print("*", end='')
                else: print(" ",end='')
            print("")
ganesha_pattern(int(input()))