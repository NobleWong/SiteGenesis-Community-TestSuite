/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test validates the persistent cart feature. It consists of two parts. One for the persistent user cart and one for the site. 
 * (Caution: make sure the persistent cart feature is activated in the BM)</p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies.</li>
 * <li>Create a new Account </li>
 * <li>Search and add a product to the cart</li>
 * <li>Store product data</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <h2 id="persistent-user-cart">Persistent user cart</h2>
 * <ul>
 * <li>validate product in cart</li>
 * <li>logout</li>
 * <li>delete visible cookies</li>
 * <li>login</li>
 * <li>validate that product is still in cart</li>
 * </ul>
 * <h2 id="persistent-site-cart">Persistent site cart</h2>
 * <ul>
 * <li>open clean page</li>
 * <li>Search Product and add to cart (the same as before ) </li>
 * <li>validate cart</li>
 * <li>delete cookies</li>
 * <li>open site again</li>
 * <li>validate cart</li>
 * </ul>
 */
@ScriptName
("tests.cart.TCart_ValidatePersistentCart")
public class TCart_ValidatePersistentCart extends AbstractScriptTestCase
{
}