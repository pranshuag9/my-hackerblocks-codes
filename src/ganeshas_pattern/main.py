'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/6/1055/problem
 Algorithm:
 1. Take input n
 2. if n is odd then
 3. start = 1, c = (n+1)/2, end=n
 4. for x:=1 to n + 1 step by 1
 5. for y:=1 to n + 1 step by 1
 6. if x == c or (x < c && ((y == start) || (y > c && x == start)))
      or (x > c && ((y < c && x == end) || (y > c && y == end)))
   or (y == c && (x > c || x < c)))
       Print("*")
 7. else Print(" ")
 8. end for loop
 9. Print(newline)
 10.end for loop
 11. else Recursively call(n+1)
'''


def ganesha_pattern(n):
    if n % 2 == 1:
        start, mid, end = 1, int((n + 1) / 2), n
        for row in range(1, n + 1):
            for col in range(1, n + 1):
                if row == mid or ((row < mid and ((col == start) or (col > mid and row == start))) or (row > mid and ((col < mid and row == end) or (col > mid and col == end)))) or ((row > mid or row < mid) and col == mid): print("*", end='')
                else: print(" ", end='')
            print()
    else: ganesha_pattern(n + 1)


ganesha_pattern(int(input()))