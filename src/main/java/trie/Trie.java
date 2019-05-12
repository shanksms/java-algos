package trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */
class Trie {
  TrieNode head = null;
  /** Initialize your data structure here. */
  public Trie() {
    head = new TrieNode();
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    TrieNode ptr = head;
    int i = 0;
    while(i<word.length()) {
      char ch = word.charAt(i);
      if(!ptr.charToNext.containsKey(ch)) {
        ptr.charToNext.put(ch, new TrieNode());
      }
      ptr = ptr.charToNext.get(ch);
      i++;
    }
    ptr.isEOW = true;
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    TrieNode ptr = head;
    int i = 0;
    while(i<word.length()) {
      char ch = word.charAt(i);
      if(!ptr.charToNext.containsKey(ch)) {
        return false;
      }
      ptr = ptr.charToNext.get(ch);
      i++;
    }
    return ptr.isEOW;
  }

  /** Returns if there is any word in the trie that starts with the given prefix. */
  public boolean startsWith(String prefix) {
    TrieNode ptr = head;
    int i = 0;
    while(i<prefix.length()) {
      char ch = prefix.charAt(i);
      if(!ptr.charToNext.containsKey(ch)) {
        return false;
      }
      ptr = ptr.charToNext.get(ch);
      i++;
    }
    return true;
  }
}
class TrieNode {
  Map<Character, TrieNode> charToNext;
  boolean isEOW;

  public TrieNode() {
    charToNext = new HashMap();
  }
}
