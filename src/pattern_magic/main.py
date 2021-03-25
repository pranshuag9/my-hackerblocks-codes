'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/282/problem
 Algorithm:
 1. Take input n
 2. Modify n to 2n-1
 3. Set c = n / 2
 4. for x:=0 to n step by 1
 5. for y:=0 to n step by 1
 6. if [y <= c and (y <= x - c or y <= -x + c)] 
       or [y > c and (y >= x + c or y >= -x + 3c)] then
             Print("*")
 7. else     Print(" ")
 8. Print(Newline)
'''
import re

def pattern_magic(n):
    n = 2 * n - 1
    C = int(n/2)
    for X in range(n):
        for Y in range(n):
            if (Y <= C and (Y <= -X + C or Y <= X - C)) or (Y > C and (Y >= X + C or Y >= -X + 3 * C)):
                print("*", end='')
            else:
                print(" ", end='')
        print()

# Taking irregular testcases like a Scanner Class in java
def take_input(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return " ".join(arr).strip()

if __name__ == "__main__":
    n = int(take_input(1))
    pattern_magic(n)