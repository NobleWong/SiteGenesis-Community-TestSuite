/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.account;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test login using an invalid password.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account with profile data</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Click login link in the header and go to the login page</li>
 * <li>Validate login page</li>
 * <li>Enter username, invalid password and try to login</li>
 * <li>Validate error message</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName("tests.account.us.TAccountLogin_InvalidPassword")
@TestTargets({ "FF_1500x1000","Chrome_1280x900","firefox_sl" })
public class TAccountLogin_InvalidPassword extends AbstractAnnotatedScriptTestCase {
}