package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
      Result result = JUnitCore.runClasses(AllTests.class);
      System.out.println("# of tests: "+result.getRunCount()+"");
      System.out.println("=======================");
      for (Failure failure : result.getFailures()) {
         System.out.println("Failed test: "+failure.toString()+"");
      }
      System.out.println("=======================");
      System.out.println("All tests were successful?: "+result.wasSuccessful()+"");
   }

} 
