package core;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SurfireTest {
  @Test
  public void test_case001() {
	  	  String s="TestNG";
	  	  Assert.assertEquals("TestNG",s);}
  /*
   * For creation surfire report you need to use valid POM.xml, testng.xml and RUN AS maven "configuration"
   * In configuration you need to input "site" in field goal
   * You can use "mvn site" from command line if your testng.xml is in root directory of yours project
   */
}
