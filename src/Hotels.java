public class Hotels {
    int numOfRooms;

    public Hotels(int numOfRooms) {
        int numOfRooms1 = numOfRooms;
        this.numOfRooms = numOfRooms1;

        Rooms[] room = new Rooms[numOfRooms];

        for (int i = 0; i < numOfRooms1; i++) {
            if (i == 0) {
                room[i] = new Single(i);
            } else if (i % 2 == 0) {
                room[i] = new Double(i);
            } else {
                room[i] = new Suite(i);
            }
        }
    }

    public void reservation(int roomToReserve) {


    }
}
