/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author mschoenauer1
 */
public class FakeDatabase {
    private final Customer[] customerData = 
    {
        new Customer("Mike Schoenauer"),
        new Customer("Dave Merkel"),
        new Customer("Steve Schoenauer")
    };
    
    private final Product[] productsData = 
    {
        new Product(1111111, 30.00, "Hat", new DiscountByPercent(.10)),
        new Product(2222222, 50.00, "Shirt", new DiscountByQuantity(2,.33)),
        new Product(3333333, 60.00, "Pants", new DiscountByFlatRate(0.00)),
        new Product(4444444, 5.00, "Socks", new DiscountByQuantity(3,.20))
    };
    
    public Customer findCustomerByIndex(int index) {
        return customerData[index];
    }
    
    public Product findProductbySKU(int sku) {
        Product foundProduct = new Product();
        
        for (Product p : productsData) {
            if (sku == p.getSku()) {
                foundProduct = p;
                return foundProduct;
            }
        }
        return foundProduct;
    }
}
