/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.checkout;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test returning customer order with two saved addresses, saved credit card and
 * two basic products including validation of order summary via check order
 * status in account.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Create new account with profile data</li>
 * <li>Add one address to account for shipping</li>
 * <li>Add another address to account for billing</li>
 * <li>Add credit card to account for billing.</li>
 * <li>Logout</li>
 * <li>Add product 01 to cart (quantity 1)</li>
 * <li>Add product 02 to cart (quantity 2)</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Start checkout as returning customer</li>
 * <li>Select saved shipping address and configured shipping method</li>
 * <li>Select saved billing address and credit card</li>
 * <li>Validate place order page</li>
 * <li>Validate order confirmation, store order number and date</li>
 * <li>Logout</li>
 * <li>Validate order summary via check order status</li>
 * </ul>
 */
@ScriptName("tests.checkout.TCheckoutOrder_RegisteredReturningCustomer")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TCheckoutOrder_RegisteredReturningCustomer extends AbstractAnnotatedScriptTestCase {
}