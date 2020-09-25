'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/206/problem
'''
def cumulative_sum_till_negative(sum=0):
    while True:
        n = int(input())
        sum += n
        if sum < 0:
            sum -= n
            break
        else: print(n)
    return sum
cumulative_sum_till_negative()