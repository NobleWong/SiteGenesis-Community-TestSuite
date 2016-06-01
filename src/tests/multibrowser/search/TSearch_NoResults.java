/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.search;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test search for no products found.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Search for text</li>
 * <li>Leads to an empty search result page with suggestion</li>
 * <li>Validate empty search result</li>
 * </ul>
 */
@ScriptName("tests.search.TSearch_NoResults")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TSearch_NoResults extends AbstractAnnotatedScriptTestCase {
}