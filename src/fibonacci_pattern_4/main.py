'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/498/problem
'''
MAX_LENGTH = 5050
series = [0 for i in range(MAX_LENGTH)]
def fibonacci_pattern(n):
    series[0], series[1] = 0, 1 
    for i in range(2, MAX_LENGTH):
        series[i] = series[i - 1] + series[i - 2]
    i = 0
    for row in range(n):
        for col in range(row + 1):
            print(f"{series[i]}\t", end='')
            i += 1
        print()
if __name__ == "__main__":
    n = int(input().strip())
    fibonacci_pattern(n)