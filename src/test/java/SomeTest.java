  
package net.codejava;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomeTest extends TestFormApplication {
   @Test public void test1() {
      run();
   }

   @Test public void test2() {
      run();
   }
  
  
   // test the setUserName
   @Test public void testSetName() {
      testUser.setName("Norma");
      String thisTestName = testUser.getName();
      assertEquals("Norma", thisTestName);
   }

   // test the setGender
   @Test public void testSetGender() {
      testUser.setGender("Female");
      String thisTestGender = testUser.getGender();
      assertEquals("Female", thisTestGender);
   }

}
