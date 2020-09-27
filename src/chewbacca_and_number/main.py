'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/132/problem
'''
def chewbacca_and_numbers(n):
    num, sum, i = n, 0, 0
    while n > 9:
        rem = n % 10
        if rem > 9 - rem: rem = 9 - rem
        powerToI = int(10**i)
        sum += int(rem * powerToI)
        i += 1
        n = int(n / 10)
    first_digit = int(num/(10**i))
    if first_digit is not 9 and first_digit > 9 - first_digit: first_digit = 9 - first_digit
    powerToI = 10**i
    sum += first_digit * powerToI
    return sum

if __name__ == "__main__":
    n = int(input().strip())
    print(chewbacca_and_numbers(n))