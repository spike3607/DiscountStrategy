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
    private double flatRateOff;

    public DiscountByQuantity() {
    }

    public DiscountByQuantity(int qnfd, double flatRateOff) {
        this.quantityNeededForDiscount = qnfd;
        this.flatRateOff = flatRateOff;
    }

    public int getQuantity() {
        return quantityNeededForDiscount;
    }

    public void setQuantity(int quantity) {
        this.quantityNeededForDiscount = quantity;
    }

    public double getFlatRateOff() {
        return flatRateOff;
    }

    public void setFlatRateOff(double flatRateOff) {
        this.flatRateOff = flatRateOff;
    }
      
    @Override
    public double getDiscountAmount(double price) {
        return 0.0;
    }

}
