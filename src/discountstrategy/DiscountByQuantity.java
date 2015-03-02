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
public class DiscountByQuantity implements DiscountInterfaceStrategy {
    
    private int quantityNeededForDiscount;
    private double rate;

    public DiscountByQuantity() {
    }

    public DiscountByQuantity(int qnfd, double rate) {
        this.quantityNeededForDiscount = qnfd;
        this.rate = rate;
    }

    public int getQuantity() {
        return quantityNeededForDiscount;
    }

    public void setQuantity(int quantity) {
        this.quantityNeededForDiscount = quantity;
    }

    public int getQuantityNeededForDiscount() {
        return quantityNeededForDiscount;
    }

    public void setQuantityNeededForDiscount(int quantityNeededForDiscount) {
        this.quantityNeededForDiscount = quantityNeededForDiscount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getDiscountAmount(double price, int quantity) {
        if (quantity >= quantityNeededForDiscount) {
            return (price * quantity) * rate;
        }
        else
            return 0.0;
    }

}
