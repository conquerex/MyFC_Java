package city;

import java.util.ArrayList;

import constructure.Constructure;
import creature.Creature;

public abstract class City {
    
    // 면적
    protected double area;
    // 도시 등급
    protected String city_level;
    // 도시 번호
    protected int city_no;
    // 평균 기온
    protected float avg_tempture;
    // 강수량
    protected float avg_rainfall;
    // 시장
    protected String mayor;
    // 예산
    protected long money;
    // 건물 대장
    protected ArrayList<Constructure> constructures = new ArrayList<>();
    // 생명체 대장
    protected ArrayList<Creature> creatures = new ArrayList<>();
    
    // 세금을 걷는다 
    public void collectTax(long money){
        this.money = money;
    }
    // 건물을 짓는다 
    public abstract void build(Constructure cons);
    // 복지
    public long giveMoney(long money){
        this.money = money;
        return money;
        
    }
    // 전입
    public void input(Creature cre){
        creatures.add(cre);
    }
    // 전출
    public void output(Creature cre){
        creatures.remove(cre);
    }
}
