/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.account;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test update profile data in account.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account with profile data</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Login using the prepared account</li>
 * <li>Update profile data (firstname, lastname and email)</li>
 * <li>Logout via corresponding link on account page</li>
 * <li>Login with new email</li>
 * <li>Validate new profile data</li>
 * <li>Change password</li>
 * <li>Logout via corresponding link on account page</li>
 * <li>Login with new password</li>
 * </ul>
 */
@ScriptName("tests.us.account.TAccountPersonalData_UpdateProfile")
@TestTargets({ "FF_1500x1000","Chrome_1280x900","firefox_sl" })
public class TAccountPersonalData_UpdateProfile extends AbstractAnnotatedScriptTestCase {
}