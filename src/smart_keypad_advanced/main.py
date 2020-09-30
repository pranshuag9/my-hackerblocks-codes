'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1092/problem
'''
table = [" ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz"]
substrings = []
def smart_keypad(lst, i, str_lst):
    if i == len(lst):
        substrings.append(str_lst)
        return
    for j in range(0, len(table[lst[i]]), 1):
        ch = table[lst[i]][j]
        smart_keypad(lst, i + 1, str_lst + ch)
def smart_keypad_advanced():
    search_in = ["prateek", "sneha", "deepak", "arnav", "shikha", "palak",
                "utkarsh", "divyam", "vidhi", "sparsh", "akku"]
    for i in range(0, len(substrings), 1):
        s1 = substrings[i]
        for j in range(0, len(search_in), 1):
            s2 = search_in[j]
            if s1 in s2:
                print(s2)
if __name__ == "__main__":
    n = int(input().strip())
    lst = []
    while n > 0:
        rem = n % 10
        n = int(n / 10)
        lst.insert(0, rem)
    str_lst = ""
    smart_keypad(lst, 0, str_lst)
    smart_keypad_advanced()