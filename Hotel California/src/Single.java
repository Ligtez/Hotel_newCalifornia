class Single extends Rooms {

    public Single(int doorNumber) {
        this.doorNumber = doorNumber + 1;
        this.typeOfRoom = "Single";
        System.out.println(this.doorNumber + " - Single -" + "reserved: " + isReserved);

    }
}
