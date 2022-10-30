public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;

    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public static DigitalVideoDisc[] removeTheElement(DigitalVideoDisc[] arr, int index) {

        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        DigitalVideoDisc[] anotherArray = new DigitalVideoDisc[arr.length - 1];

        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,
                anotherArray, index,
                arr.length - index - 1);

        return anotherArray;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        Boolean isValid = true;
        if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full");
        } else {
            if (this.qtyOrdered == 0) {
                this.itemsOrdered[this.qtyOrdered] = disc;
                this.qtyOrdered++;
                System.out.println("The disc has been added");
            } else {
                for (int i = 0; i < qtyOrdered; i++) {
                    if (this.itemsOrdered[i].getTitle() == disc.getTitle()) {
                        System.out.println("Can not add because this product is adready added!!");
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    this.itemsOrdered[this.qtyOrdered] = disc;
                    this.qtyOrdered++;
                    System.out.println("The disc has been added");
                }
            }

        }

    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dics) {
        Boolean isValid = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (this.itemsOrdered[i].getTitle() == dics.getTitle()) {
                this.itemsOrdered = removeTheElement(this.itemsOrdered, i);
                this.qtyOrdered--;
                System.out.println("Delete success");
                isValid = true;
                break;
            }
        }

        if (!isValid) {
            System.out.println("Can not delete");
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost = totalCost + this.itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Order anOrder = new Order();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("Jhon Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is: " + anOrder.totalCost());
    }

}
