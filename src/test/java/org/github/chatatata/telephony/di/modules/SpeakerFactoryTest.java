package org.github.chatatata.telephony.di.modules;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SpeakerFactoryTest {
    private SpeakerFactory factory;

    @Before
    public void setUp() {
        factory = new SpeakerFactory();
    }

    @Test
    public void providesRegularSpeaker() {
        assertNotNull(factory.provideSpeaker());
    }

    @Test
    public void providesLickySpeaker() {
        assertNotNull(factory.provideLickySpeaker());
    }
}