/**
 * Course
 */
public class Course implements Comparable {

    private String name;
    private int capacity;
    private int room;

    public Course(String name, int room, int capacity) {
        setName(name);
        setCapacity(capacity);
        setRoom(room);
    }

    public Course(String name, int room) {
        setName(name);
        setCapacity(0);
        setRoom(room);
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }
    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param room the room to set
     */
    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass() == Course.class) {
            Course comparing = ((Course)o);
            if (this.room == comparing.getRoom()) {
                return this.name.compareTo(comparing.getName());
            } else {
                return this.room > comparing.room ? 1 : 0;
            }
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Course.class) {
            return this.name == ((Course)obj).getName();
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public String toString() {
        return room + " " + name;
    }


}