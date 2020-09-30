'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/1381/problem
'''
def replace_all_pi(end, current, given, ans):
    if len(given) <= 1: return given
    if current == end: return ans
    ans = ans + given[current]
    if current is not 0:
        string = given[current - 1 : current + 1]
        if string == "pi": ans = ans[0 : len(ans) - 2] + "3.14"
    ans = replace_all_pi(end, current + 1, given, ans)
    return ans
if __name__ == "__main__":
    testcases = int(input().strip())
    for testcase in range(0, testcases, 1):
        string = input().strip()
        print(replace_all_pi(len(string), 0, string, ""))