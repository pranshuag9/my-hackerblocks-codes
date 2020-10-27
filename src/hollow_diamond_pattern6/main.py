'''
 @author: Pranshu Aggarwal
 @problem: 
'''
def hollow_diamond_pattern(n):
    mid = int(n/2)
    for row in range(n):
        for col in range(n):
            if (col <= mid and (col <= -row + mid or col <= row - mid)) or (col > mid and (col >= row + mid or col >= -row + 3 * mid)):
                print("* ", end='')
            else:
                print("  ", end='')
        print()
if __name__ == "__main__":
    n = int(input().strip())
    hollow_diamond_pattern(n)