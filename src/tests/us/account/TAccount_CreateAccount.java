/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.us.account;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test register profile with create account via link in header.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies, create email and password</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Click register link in the header and goto the create account page</li>
 * <li>Enter profile data and submit the form</li>
 * <li>Logout using the link in the account area</li>
 * <li>Validate logout via user menu panel header</li>
 * <li>Login again to validate login data</li>
 * <li>Validate login via user menu panel header</li>
 * <li>Validate personal profile data</li>
 * <li>Logout using the global link in the header</li>
 * <li>Validate logout via user menu panel header</li>
 * </ul>
 */
@ScriptName("tests.us.account.TAccount_CreateAccount")
public class TAccount_CreateAccount extends AbstractScriptTestCase
{
}