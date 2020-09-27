'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1320/problem
'''
def get_roots_using_shridharacharya(a, b, c):
    d = b*b - 4*a*c
    alpha = ((-b) + (d**0.5)) / 2*a
    beta = ((-b) - (d**0.5)) / 2*a
    
    return alpha, beta, d

(a, b, c) = (int(x) for x in input().split(" "))
alpha, beta, d = get_roots_using_shridharacharya(a, b, c)
if d is 0: print(f"Real and Equal\n{int(alpha)} {int(beta)}")
elif d > 0: print(f"Real and Distinct\n{int(beta)} {int(alpha)}")
else: print("Imaginary")