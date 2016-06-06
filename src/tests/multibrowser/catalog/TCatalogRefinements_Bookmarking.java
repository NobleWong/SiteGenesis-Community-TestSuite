/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.catalog;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies that the sorting and selecting of refinements is preserved when the
 * url is used again.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Browse to category</li>
 * <li>Select color by name</li>
 * <li>Select sorting</li>
 * <li>Select page size</li>
 * <li>Goto next page</li>
 * </ul>
 */
@ScriptName("tests.catalog.TCatalogRefinements_Bookmarking")
@TestTargets({ "FF_1500x1000","Chrome_1280x900","firefox_sl" })
public class TCatalogRefinements_Bookmarking extends AbstractAnnotatedScriptTestCase {
}