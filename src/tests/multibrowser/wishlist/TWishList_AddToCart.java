/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.wishlist;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test add product to cart from wishlist.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * <li>Add product to wishlist</li>
 * <li>Logout</li>
 * <li>Start new session and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Login</li>
 * <li>Go to wishlist</li>
 * <li>Add product to cart</li>
 * <li>Validate cart</li>
 * <li>Logout</li>
 * </ul>
 */
@ScriptName("tests.us.wishlist.TWishList_AddToCart")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TWishList_AddToCart extends AbstractAnnotatedScriptTestCase {
}