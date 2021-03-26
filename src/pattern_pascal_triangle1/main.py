'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/285/problem
 Algorithm to Generate(arr, n):
 for row:=0 to n step by 1,
         for col:=0 to row + 1 step by 1,
             Set arr[row][col] = 1 if column is 0 or equals row
             Set arr[row][col] = (Sum of Diagonally Previous element and Upper previous element) if row > 1 and col > 0
 
 Algorithm to Print(n):
 for row:=0 to n step by 1
         for col:=0 to (n - row) step by 1, Print("  ")
         for col:=0 to (row + 1) step by 1,
             for i:=0 to (4 - number of digits of n) step by 1, Print(" ")
             Print(arr[row][col])
         Print(newline)
'''
def generate_pascal_triangle(n):
    arr = [[0 for _ in range(0, n)] for _ in range(0, n)]
    arr[0][1] = 1
    for row in range(0, n):
        for col in range(0, row + 1):
            if col == 0 or col == row: arr[row][col] = 1
            if row > 1 and col > 0: arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col]
    return arr
def pascal_triangle1(n):
    if n == 1 or n == 0:
        print(1)
        return 
    arr = generate_pascal_triangle(n)
    for row in range(0, n):
        for col in range(0, n - row): print("  ", end='')
        for col in range(0, row + 1):
            for _ in range(0, 4 - len(str(arr[row][col]))): print(" ", end='')
            print(arr[row][col], end='')
        print()
        
if __name__ == "__main__":
    n = int(input().strip())
    pascal_triangle1(n)