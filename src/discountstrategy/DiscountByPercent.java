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
public class DiscountByPercent implements DiscountInterfaceStrategy {
    private double rate;

    public DiscountByPercent() {
    }

    public DiscountByPercent(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public double getDiscountAmount(double price, int quantity) {
        return (price * quantity) * rate;
    }
    
}
