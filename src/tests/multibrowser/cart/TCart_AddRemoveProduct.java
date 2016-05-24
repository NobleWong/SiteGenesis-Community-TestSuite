/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.cart;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test add and remove product in cart.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add basic product to cart</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Validate cart page</li>
 * <li>Validate product row</li>
 * <li>Validate product row basic details</li>
 * <li>Validate product row total</li>
 * <li>Validate cart totals subtotal</li>
 * <li>Remove product</li>
 * <li>Validate empty cart</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName("tests.cart.TCart_AddRemoveProduct")
@TestTargets({ "FF_1500x1000" })
public class TCart_AddRemoveProduct extends AbstractAnnotatedScriptTestCase {
}