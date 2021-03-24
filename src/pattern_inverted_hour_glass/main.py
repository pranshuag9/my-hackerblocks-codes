'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/488/problem
 Algorithm:
 1. Set Middlerow = n, Middlecol = n+1, nn1 = 1, nn2 = 1, nsp = 2n-1, last = 2n+1
 2. for row:=1 to end+1 step by 1
         for col:=1 to end+1 step by 1
             if col <= (number of numbers in block1 nn1) then Print(Middlecol - col + " ")
             else if col <= (number of spaces nsp + nn1) then Print("  ")
             else if col <= (nsp + nn1 + number of numbers in block2 nn2) then Print(col - Middlecol + " ")
 3.     nn1 = nn1+1 if row <= Middlerow else nn1-1
 4.     nn2 = nn2+1 if row <= Middlerow else nn2-1
 5.     nsp = nsp-2 if row <= Middlerow else nsp+2
 6.     Print(newline)
 7. end for loop
'''
import re


def print_inverted_hour_glass(n):
    middlerow, middlecol, nn1, nn2, nsp, last = n, n + 1, 1, 1, 2 * n - 1, 2 * n + 1
    for row in range(1, last + 1):
        for col in range(1, last + 1):
            if col <= nn1: print(str(middlecol - col) + " ", end='')
            elif col <= (nsp + nn1): print("  ", end='')
            elif col <= (nsp + nn1 + nn2): print(str(col - middlecol) + " ", end='')
        nn1 = nn1 + 1 if row <= middlerow else nn1 - 1
        nn2 = nn2 + 1 if row <= middlerow else nn2 - 1
        nsp = nsp - 2 if row <= middlerow else nsp + 2
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
    print_inverted_hour_glass(n)
