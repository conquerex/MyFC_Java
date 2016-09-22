import city.City;
import city.Seoul;
import city.gu.Gangnam;

public class MainExtends2 {
    public static void main(String[] args) {
        City gangnam = new Gangnam();
        City seoul = new Seoul();
        
        seoul.collectTax(1000);
        gangnam.collectTax(1000);
        
    }
}
