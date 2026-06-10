package demoblaze;

import com.intuit.karate.junit5.Karate;

public class DemoblazeRunner {
    @Karate.Test
    Karate testAll() {
        return Karate.run("features/signup", "features/login")
                .relativeTo(getClass());
    }
}
