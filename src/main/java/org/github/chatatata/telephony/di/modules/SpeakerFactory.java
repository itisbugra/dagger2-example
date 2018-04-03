// SpeakerModule.java
// Copyright (c) 2016-2018 BuyBuddy Elektronik Güvenlik Bilişim Reklam Telekomünikasyon Sanayi ve Ticaret Limited Şirketi ( https://www.buybuddy.co/ )
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.

package org.github.chatatata.telephony.di.modules;

import dagger.Module;
import dagger.Provides;
import org.github.chatatata.telephony.di.qualifier.Licky;
import org.github.chatatata.telephony.phone.LickyPhone;
import org.github.chatatata.telephony.phone.RegularPhone;
import org.github.chatatata.telephony.Speaker;

/**
 *
 */
@Module
public class SpeakerFactory {
    /**
     * Provides a regular speaker. It is the default instance served when no accompanying annotations exist.
     * @return A new {@link RegularPhone} instance.
     */
    @Provides
    public Speaker provideSpeaker() {
        return new RegularPhone();
    }

    /**
     * Provides a licky speaker. We annotate this class with {@link Licky} annotation. It's cool.
     * This method is not called every time you inject an instance of the class. It is called once if you specify
     * the class of provided instance to be {@link javax.inject.Singleton}.
     * @return A new {@link LickyPhone} instance.
     */
    @Provides
    @Licky
    public Speaker provideLickySpeaker() {
        return new LickyPhone();
    }
}
