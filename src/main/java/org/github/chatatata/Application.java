package org.github.chatatata;

import org.github.chatatata.telephony.di.qualifier.Licky;
import org.github.chatatata.telephony.Speaker;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Suppress "WeakerAccess", since Dagger is not able to inject to private fields.
 */
@SuppressWarnings("WeakerAccess")
public class Application {
    //  Inject the speaker
    @Inject Speaker speaker;

    //  Inject the licky one here
    @Inject @Licky Speaker lickySpeaker;

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {
        //  Inject the dudes.
        DaggerSpeakerComponent.create().inject(this);

        try {
            System.out.println("Watch out for the speaker:");
            speaker.speak();

            System.out.println("Now the licky one:");
            lickySpeaker.speak();
        } catch (IOException e) {
            throw new InternalError("The speaker could not speak.", e);
        }
    }
}
