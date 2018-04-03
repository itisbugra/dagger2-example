package org.github.chatatata;

import org.github.chatatata.telephony.phone.LickyPhone;
import org.github.chatatata.telephony.phone.RegularPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ApplicationTest {
    private Application application;

    @Before
    public void setUp() {
        application = new Application();
    }

    @Test
    public void hasRegularSpeaker() {
        assertTrue(application.getSpeaker() instanceof RegularPhone);
    }

    @Test
    public void hasLickySpeaker() {
        assertTrue(application.getLickySpeaker() instanceof LickyPhone);
    }
}