public class Pizza {
    String bread;
    String sauce;
    String chese;
    String topping;
    
    Pizza() {
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String chese) {
        this.bread = bread;
        this.sauce = sauce;
        this.chese = chese;
    }

    Pizza(String bread, String sauce, String chese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.chese = chese;
        this.topping = topping;
    }
}
