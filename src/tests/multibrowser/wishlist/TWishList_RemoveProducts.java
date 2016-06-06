/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.wishlist;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test remove and resorting rows in wishlist.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account</li>
 * <li>Add four products to wishlist (1, 2, 3, 4)</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Remove last item in cart (4)</li>
 * <li>Remove middle item (2)</li>
 * <li>Remove first item (1)</li>
 * <li>Remove the last item (3)</li>
 * </ul>
 */
@ScriptName("tests.wishlist.TWishList_RemoveProducts")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TWishList_RemoveProducts extends AbstractAnnotatedScriptTestCase {
}