/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.product;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies functionality of option products on quickview and product details
 * pages.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>start session, open homepage and delete all visible cookies</li>
 * <li>search products</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>open quickview</li>
 * <li>select option</li>
 * <li>open product detail page (Note: No option will be preselected there)</li>
 * <li>select option</li>
 * </ul>
 * <p>
 * Note: This test is prepared as data driven test. Running it as junit test
 * will execute the test multiple times using the set of test data in the
 * _datasets.xml file.
 * </p>
 */
@ScriptName("tests.product.TProduct_Validate_OptionProductFunctionality")
@TestTargets({ "FF_1500x1000","Chrome_1280x900","firefox_sl","IE11_1280x900" })
public class TProduct_Validate_OptionProductFunctionality extends AbstractAnnotatedScriptTestCase {
}