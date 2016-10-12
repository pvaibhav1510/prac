/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.linked_list;

import java.io.*;
import java.util.*;

/**
 *
 * @author vaibhav
 */
public class PalindromeStackQueue {

    Queue<Character> q = new LinkedList<Character>();
    Stack<Character> s = new Stack<Character>();

    void pushCharacter(char c) {
        s.add(c);
    }

    void enqueueCharacter(char c) {
        q.add(c);
    }

    char popCharacter() {
        return (char)s.pop();
    }

    char dequeueCharacter() {
        return (char)q.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeStackQueue p = new PalindromeStackQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
