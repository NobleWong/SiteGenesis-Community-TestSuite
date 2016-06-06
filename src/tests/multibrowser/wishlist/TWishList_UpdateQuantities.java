/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.wishlist;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test update product quantity on wishlist.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>add two random products to cart</li>
 * <li>update quantities using random number</li>
 * <li>logout and login</li>
 * <li>validate wishlist</li>
 * </ul>
 */
@ScriptName("tests.wishlist.TWishList_UpdateQuantities")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TWishList_UpdateQuantities extends AbstractAnnotatedScriptTestCase {
}