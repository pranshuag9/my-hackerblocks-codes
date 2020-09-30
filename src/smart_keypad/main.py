'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/742/problem
'''
table = [" ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz"]
def smart_keypad(lst, i, str_lst):
    if i == len(lst):
        print(str_lst)
        return
    for j in range(0, len(table[lst[i]]), 1):
        ch = table[lst[i]][j]
        smart_keypad(lst, i + 1, str_lst + ch)
if __name__ == "__main__":
    n = int(input().strip())
    lst = []
    while n > 0:
        rem = n % 10
        n = int(n / 10)
        lst.insert(0, rem)
    str_lst = ""
    smart_keypad(lst, 0, str_lst)