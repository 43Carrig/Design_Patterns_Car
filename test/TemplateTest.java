

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import template.*;

public class TemplateTest {

    @org.junit.Test
    public void TestTemplate()
    {
        Driver newLearnerDriver = new NewLearnerDriver("Sean");

        Assert.assertEquals("Sean", newLearnerDriver.getName());
        Assert.assertNotEquals("John", newLearnerDriver.getName());

        Assert.assertEquals("New Learner driver accelerates!" + "Sean", newLearnerDriver.accelerate() + newLearnerDriver.getName());
        Assert.assertNotEquals("New Experienced driver accelerates!" + "Barry", newLearnerDriver.accelerate() + newLearnerDriver.getName());

        Assert.assertEquals("New Learner driver brakes!", newLearnerDriver.brake());
        Assert.assertNotEquals("New Experienced driver brakes!", newLearnerDriver.brake());

        Assert.assertEquals("New Learner driver accelerates!New Learner driver brakes!", newLearnerDriver.drive());
        Assert.assertNotEquals("Experienced TemplateDriver accelerates!Experienced TemplateDriver brakes!", newLearnerDriver.drive());

        //****************************

        Driver experiencedDriver = new ExperiencedDriver("Barry");

        Assert.assertEquals("Barry", experiencedDriver.getName());

        Assert.assertEquals("Experienced TemplateDriver accelerates!", experiencedDriver.accelerate());

        Assert.assertEquals("Experienced TemplateDriver brakes!", experiencedDriver.brake());

        Assert.assertEquals("Experienced TemplateDriver accelerates!Experienced TemplateDriver brakes!", experiencedDriver.drive());
    }
}
