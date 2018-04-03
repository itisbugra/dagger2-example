package org.github.chatatata.telephony.phone;

import org.junit.Before;
import org.junit.Test;

public class LickyPhoneTest {
    private LickyPhone phone;

    @Before
    public void setUp() {
        phone = new LickyPhone();
    }

    @Test
    public void speaks() throws Exception {
        phone.speak();
    }
}