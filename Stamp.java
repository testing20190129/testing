package com.aswatson.fortress.facades;

public interface Stamp extends FtrCheckoutFacade {
    boolean isRedeemCheckoutWithDelivery();
    void setEStampPayment();
    boolean checkoutCartHasEStampPromotion();
    void addLocalSegment(Integer promoExtId);

    boolean applyEStampPromoVoucher(String promoExtId);
    boolean isSufficientEStamp(Integer requireAmount);
}
