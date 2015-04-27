package com.jadn.cc.test;

import junit.framework.TestCase;

import com.robotium.solo.Solo;

import com.jadn.cc.core.Util;
import com.jadn.cc.R; // CQA

public class UtilTest extends TestCase {

    public void testGetCharset() {
        assertEquals("UTF-8", Util.getCharset("html/plain"));
        assertEquals("ISO-8859-1", Util
                .getCharset("application/xml; charset=ISO-8859-1"));
        assertEquals("UTF-8", Util.getCharset(null));
    }

    // CQA
    public static void closeSplash(Solo solo) {
        if (solo.waitForView(R.id.splashscreen)) {
            solo.clickOnView(solo.getView(R.id.splashscreen));
        }
    }
}
