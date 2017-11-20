/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.product;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies the structure/layout of quickview (QV) and product details pages
 * (PDP) for product sets
 * </p>
 * <h1 id="setup">Setup</h1>
 * <p>
 * Open the site and remove cookies
 * </p>
 * <h1 id="scope">Scope</h1>
 * <p>
 * Validate displaying product data either via quick view or via product detail
 * page.
 * </p>
 * <ul>
 * <li>validate structure of the QV</li>
 * <li>go from QV to PDP</li>
 * <li>validate structure of PDP</li>
 * <li>check if product name, price, and product number are the same on both
 * </li>
 * <li>search for product name and validate PDP again</li>
 * </ul>
 */
@ScriptName("tests.product.TProduct_Validate_ProductSetLayout")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TProduct_Validate_ProductSetLayout extends AbstractAnnotatedScriptTestCase {
}