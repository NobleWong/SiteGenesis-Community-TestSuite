/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.search;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test the did you mean functionality
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Search for text with no suggestion</li>
 * <li>Search for a simple text with a suggestion and click it</li>
 * <li>Search for a more complex phrase with a suggestion and click it</li>
 * </ul>
 */
@ScriptName("tests.search.TSearch_DidYouMean")
@TestTargets({ "FF_1500x1000" })
public class TSearch_DidYouMean extends AbstractAnnotatedScriptTestCase {
}