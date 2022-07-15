class Double extends Rooms {

    public Double(int doorNumber) {
        this.doorNumber = doorNumber + 1;
        this.typeOfRoom = "Double";
        System.out.println(this.doorNumber + " - Double -" + "reserved: " + isReserved);

    }
}
