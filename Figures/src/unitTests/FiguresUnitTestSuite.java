package unitTests;

import figures.Rectangle;
import figures.Square;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses( { RectangleUnitTest.class, SquareUnitTest.class, CircleUnitTest.class })
@RunWith(Suite.class)
public class FiguresUnitTestSuite {
}
