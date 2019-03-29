package model;
 /**
 * Course
 */
public class Course implements Comparable {

    private String name;
    private int room;
    private String period;

    public Course(String name, int room, String period) {
        setName(name);
        setRoom(room);
        setPeriod(period);
    }

    public Course(String name, int room) {
        setName(name);
        setRoom(room);
        period = null;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the room
     */
    public int getRoom() {
        return room;
    }
    /**
     * @return the period
     */
    public String getPeriod() {
        return period;
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
    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
        for (String p : Period.PERIODS) {
            if (p.equals(period)) {
                this.period = period;
                return;
            }
        }
        this.period = null;    
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