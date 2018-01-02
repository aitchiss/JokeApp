import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by suzanne on 31/12/2017.
 */

@RunWith(AndroidJUnit4.class)
public class TestEndpointAsyncTask {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class, false, true);

    private String jokePrefix = "Q:";

    @Test
    public void tellJokeButtonResultsInJokeBeingDisplayed(){
        onView(withId(R.id.get_joke_button)).perform(click());
        onView(withId(R.id.tv_joke)).check(matches(not(withText(""))));
        onView(withId(R.id.tv_joke)).check(matches(withText(containsString(jokePrefix))));

    }
}
