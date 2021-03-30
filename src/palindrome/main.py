'''
 @author: Pranshu Aggarwal
 @problem: https://hack.codingblocks.com/app/practice/1/247/problem
'''
import re
def takeInput(n):
    arr = []
    while True:
        if len(arr) == n: break
        line = input().strip()
        re.sub(' +', ' ', line)
        arr.extend(line.split())
    return " ".join(arr).strip()
class Node:
    def __init__(self, data, next=None, prev=None, ):
        self.prev = prev
        self.data = data
        self.next = next
class LinkedList:
    def __init__(self, node=None):
        self.head = node
        self.tail = node
    def __str__(self):
        result, temp = "", self.head
        while temp: result, temp = result + f"{temp.data}=>", temp.next
        return result + "null"
    def append(self, data):
        if not self.head:
            self.head = Node(data)
            self.tail = self.head
        else: 
            self.tail.next = Node(data)
            self.tail.next.prev = self.tail
            self.tail = self.tail.next
    def size(self):
        count, temp = 0, self.head
        while temp: temp, count = temp.next, count + 1
        return count
    def isPalindrome(self):
        head, tail, flag, n = self.head, self.tail, True, self.size()
        if n % 2 == 0:
            while head.next != tail and tail.prev != head:
                flag = False if head.data != tail.data else True
                if not flag: break
                head, tail = head.next, tail.prev
            flag = False if head.next.data != tail.prev.data else True
        else:
            while head != tail:
                flag = False if head.data != tail.data else True
                if not flag: break
                head, tail = head.next, tail.prev
        return flag
if __name__ == "__main__":
    n = int(takeInput(1))
    ll = LinkedList()
    arr = takeInput(n).split()
    for item in arr: ll.append(int(item))
    print(f"{'true' if ll.isPalindrome() else 'false'}")