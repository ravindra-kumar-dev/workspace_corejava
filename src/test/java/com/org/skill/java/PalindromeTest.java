package com.org.skill.java;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {

   @BeforeClass
   public static void setUpBeforeClass() {
       System.out.println("Before Class");
   }

   @Before
   public void setUp() {
       System.out.println("before");
   }

   @Test
    public void testIsPalindrome() {
       System.out.println("testcase for isPalindrome");
       assertTrue( Palindrome.isPalindrome("civic"));
       assertTrue( Palindrome.isPalindrome("level"));
       assertTrue( Palindrome.isPalindrome("Radar"));
       assertTrue( Palindrome.isPalindrome("rotator"));
       assertTrue( Palindrome.isPalindrome("racecar"));
       assertFalse( Palindrome.isPalindrome("teacher"));
   }

   @Test
   public void testIsPalindromeV3() {
      System.out.println("testcase for isPalindromeV3");
      assertTrue( Palindrome.isPalindromeV3("civic"));
      assertTrue( Palindrome.isPalindromeV3("level"));
      assertTrue( Palindrome.isPalindromeV3("Radar"));
      assertTrue( Palindrome.isPalindromeV3("rotator"));
      assertTrue( Palindrome.isPalindromeV3("racecar"));
      assertFalse( Palindrome.isPalindromeV3("teacher"));
   }

   @Test
   public void testIsPalindromeV2() {
      System.out.println("testcase for isPalindromeV2");
      assertTrue( Palindrome.isPalindromeV2("racecar"));
      assertFalse( Palindrome.isPalindromeV2("Ravindra"));
   }

   @After
   public void tearDown() {
       System.out.println("after");
   }

   @AfterClass
   public static void tearDownAfterClass() {
       System.out.println("After Class");
   }
}
