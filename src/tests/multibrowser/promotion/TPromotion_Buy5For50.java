/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.promotion;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies the functionality of a buy5for50 promotion.
 * </p>
 * <h1 id="setup">Setup</h1>
 * <ul>
 * <li>Open the homepage and remove cookies</li>
 * <li>Put four promotion products into the cart</li>
 * <li>Validate that no promotion is shown</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <p>
 * Validate correct funtionality of the promotion
 * </p>
 * <ul>
 * <li>change quantity to five</li>
 * <li>validate that promotion is shown correctly</li>
 * <li>change quantity to six</li>
 * <li>validate that promotion is shown correctly</li>
 * <li>change quantity to ten</li>
 * <li>validate that promotion is shown correctly</li>
 * <li>change quantity back to 4</li>
 * <li>validate that no promotion is shown</li>
 * </ul>
 */
@ScriptName("tests.promotion.TPromotion_Buy5For50")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TPromotion_Buy5For50 extends AbstractAnnotatedScriptTestCase {
}