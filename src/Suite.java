class Suite extends Rooms {

    public Suite(int doorNumber) {
        this.doorNumber = doorNumber + 1;
        this.typeOfRoom = "Suite";
        System.out.println(this.doorNumber + " - Suite -" + "reserved: " + isReserved);

    }
}
