package com.chen.proxy.statics;

/**
 * 房东代理: 房屋中介
 *
 * @author chenzihan
 * @date 2021/12/22
 */
public class LandlordProxy extends Landlord{
    private Landlord landlord;

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        beforeRent();
        afterRent();
        landlord.rent();
    }

    private void beforeRent() {
        System.out.println("带人看房");
    }
    private void afterRent() {
        System.out.println("签合同, 收款");
    }
}
