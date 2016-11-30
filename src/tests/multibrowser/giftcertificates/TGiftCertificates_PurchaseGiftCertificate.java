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
 * <li>create an email for the receipient using an external service</li>
 * <li>open the homepage and start the session</li>
 * <li>create an account for the buyer</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>go to gift certificates page and validate it</li>
 * <li>add a gift certificate to the cart</li>
 * <li>go to the cart</li>
 * <li>validate the gift certificate in the cart</li>
 * <li>purchase cart</li>
 * <li>validate if gift certificate was sent</li>
 * <li>check balance of gift certificates</li>
 * </ul>
 */
@ScriptName("tests.us.giftcertificates.TGiftCertificates_PurchaseGiftCertificate")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TGiftCertificates_PurchaseGiftCertificate extends AbstractAnnotatedScriptTestCase {
}