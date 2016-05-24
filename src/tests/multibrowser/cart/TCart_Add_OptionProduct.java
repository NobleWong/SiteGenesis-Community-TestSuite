/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.cart;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test add option product to cart from QV and PDP.
 * </p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Search products</li>
 * <li>Open option product quickview</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>Select option and store product details</li>
 * <li>Add product to cart</li>
 * <li>Go to cart</li>
 * <li>Validate product details and calculated subtotal (product price + option
 * price)</li>
 * <li>Remove product</li>
 * <li>Search same product using stored product number</li>
 * <li>Select option</li>
 * <li>Add product to cart</li>
 * <li>Go to cart</li>
 * <li>Validate product details and calculated subtotal (product price + option
 * price)</li>
 * </ul>
 */
@ScriptName("tests.cart.TCart_Add_OptionProduct")
@TestTargets({ "FF_1500x1000" })
public class TCart_Add_OptionProduct extends AbstractAnnotatedScriptTestCase {
}