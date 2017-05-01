package suite;

import helper.StringHelperParametrizedTest;
import helper.StringHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({StringHelperTest.class, StringHelperParametrizedTest.class})
public class HelperTestSuite {
}
