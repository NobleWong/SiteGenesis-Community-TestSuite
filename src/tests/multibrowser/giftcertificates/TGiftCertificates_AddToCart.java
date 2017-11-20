/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.giftcertificates;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <h1 id="setup">Setup</h1>
 * <ul>
 * <li>create an email for the recipient</li>
 * <li>open the homepage and start the session</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>go to gift certificates page and validate it</li>
 * <li>add it to the cart</li>
 * <li>go to the cart</li>
 * <li>validate the gift cert in the cart</li>
 * </ul>
 */
@ScriptName("tests.giftcertificates.TGiftCertificates_AddToCart")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TGiftCertificates_AddToCart extends AbstractAnnotatedScriptTestCase {
}