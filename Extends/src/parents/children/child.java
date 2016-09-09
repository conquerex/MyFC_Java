package parents.children;

import parents.Parent;

public class child extends Parent{
    String book;
    int time;
    String PC;
    String lol_account;
    String girlfriend = "켈리 브룩";
    int game_money;
    
    void play(){
        System.out.println("아들이 게임 중이다.");
    }
    
    @Override
    public void drive(){
        System.out.println("아들이 "+ car +"를 몰고 나갔다.");
    }

    public void meet(){
        System.out.println("아들이 "+ girlfriend +"를 만났다.");
    }
    
    public void meetFg(){
        System.out.println("아들이 "+ super.girlfriend +"를 만났다.");
    }
    
}
