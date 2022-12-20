package SpringBasicInf.core.singleton;

import org.springframework.context.annotation.Bean;

public class StatefulService {

    public int order(String name, int price) {
        System.out.println("name = " + name + " / price = " + price);
        return price;
    }

    /*
    private int price; // 상태 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 문제부분!
    }

    public int getPrice() {
        return price;
    }
    */
}
