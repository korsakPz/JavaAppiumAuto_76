package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.ArticleTests;
import test.ChangeAppConditionTests;
import test.MyListsTests;
import test.SearchTests;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ArticleTests.class,
        ChangeAppConditionTests.class,
        MyListsTests.class,
        SearchTests.class

})

public class TestSuites {
}
