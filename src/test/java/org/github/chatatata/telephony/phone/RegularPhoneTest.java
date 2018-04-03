package org.github.chatatata.telephony.phone;

import org.junit.Before;
import org.junit.Test;

public class RegularPhoneTest {
    private RegularPhone phone;

    @Before
    public void setUp() {
        phone = new RegularPhone();
    }

    @Test
    public void speaks() throws Exception {
        phone.speak();
    }
}