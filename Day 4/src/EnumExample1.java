class EnumExample1 {
    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value1;

        private Season(int value) {
            this.value1 = value;
        }
    }

    public static void main(String args[]) {
        for (Season s : Season.values())
            System.out.println(s + " " + s.value1);
    }
}