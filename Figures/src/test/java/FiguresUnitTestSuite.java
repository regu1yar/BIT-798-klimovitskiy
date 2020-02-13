package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses( { RectangleUnitTest.class, SquareUnitTest.class, CircleUnitTest.class })
@RunWith(Suite.class)
public class FiguresUnitTestSuite {
}
