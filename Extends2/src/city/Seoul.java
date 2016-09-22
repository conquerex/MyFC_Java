package city;

import constructure.Constructure;

public class Seoul extends City{
    
    @Override
    public void build(Constructure cons) {
        //
    }

    @Override
    public void collectTax(long money) {
        //super.collectTax(money);
        // 일부를 복지기금으로 예산 배당 
        money = (long)(money * 0.9f);
        this.money = this.money + money;
    }
}
