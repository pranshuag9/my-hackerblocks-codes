package palindrome;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/247/problem
 */
class Node {
	int data;
	Node prev;
	Node next;
	Node(){ 
		this.prev = null;
		this.next = null;
	}
	Node(int data){
		this.prev = null;
		this.data = data;
		this.next = null;
	}
	Node(Node prev, int data){
		this.prev = prev;
		this.data = data;
		this.next = null;
	}
	Node(int data, Node next){
		this.prev = null;
		this.data = data;
		this.next = next;
	}
	Node(Node prev, int data, Node next){
		this.prev = prev;
		this.data = data;
		this.next = next;
	}
}
class LinkedList{
	Node head, tail;
	LinkedList(){ 
		this.head = null;
		this.tail = null;
	}
	LinkedList(Node node){
		this.head = node;
		this.tail = node;
	}
	public void append(int data) {
		if(this.head == null) {
			this.head = new Node(data);
			this.tail = this.head;
		}else{
			this.tail.next = new Node(data);
			this.tail.next.prev = this.tail;
			this.tail = this.tail.next;
		}
	}
	int size() {
		int count = 0;
		Node temp = this.head;
		while(temp != null) {temp = temp.next; count++;}
		return count;
	}
	public boolean isPalindrome() {
		Node head = this.head, tail = this.tail;
		boolean flag = true;
		int n = size();
		if(n % 2 == 0) {
			while(head.next != tail && tail.prev != head) {
				flag = head.data != tail.data ? false : true;
				if(!flag) break;
				head = head.next;
				tail = tail.prev;
			}
			flag = head.next.data != tail.prev.data ? false : true;
		}
		else {
			while(head != tail) {
				flag = head.data != tail.data ? false: true;
				if(!flag) break;
				head = head.next;
				tail = tail.prev;
			}		
		}
		return flag;
	}
	@Override
	public String toString() {
		String result = "";
		Node temp = this.head;
		while(temp != null) {
			result += temp.data + "=>";
			temp = temp.next;
		}
		return result + "null";
	}
}
public class Main {
	// My input function that can handle irregular input like Scanner Class
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(takeInput(sc, 1));
		LinkedList ll = new LinkedList();
		for(String s : takeInput(sc, n).split(" ")) ll.append(Integer.parseInt(s));
		System.out.println(ll.isPalindrome()?true:false);
		System.out.println(ll.toString());
		sc.close();
	}
}
