import helper.RunnerHelper;
import org.junit.Test;
import pages.ArticlePage;
import pages.HomePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Runner extends RunnerHelper {

   // private String query = "Endava";

    @Test
    public void Test() {
        String query = "Endava";
        HomePage home = new HomePage(webDriver);
        ArticlePage articlePage = home.search(query);
        assertThat("The article title was not found", articlePage.getArticleName(), equalTo(query));

    }
}
