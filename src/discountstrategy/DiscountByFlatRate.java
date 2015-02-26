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
public class DiscountByFlatRate implements DiscountInterfaceStrategy {
    private double flatRate;

    public DiscountByFlatRate(double flatRate) {
        this.flatRate = flatRate;
    }
    
    
    @Override
    public double getDiscountAmount(double price) {
        return flatRate;
    }
}
