public class Line {
    //Create Gate
    Gate A = new Gate("A", 0);
    Gate B = new Gate("B", 17);
    Gate C = new Gate("C", 22);
    Gate D = new Gate("D", 33);

    public int getFare(int distance) {
        if (distance <= 6) {
            return 9000;
        } else {
            int secondDistance = distance - 6;
            int numberOfTimeDivideBy2 = secondDistance / 2;
            if (secondDistance > numberOfTimeDivideBy2*2) {
                return 9000 + (numberOfTimeDivideBy2 + 1)*2000;
            } else return 9000 + numberOfTimeDivideBy2*2000;
        }
    }
}
