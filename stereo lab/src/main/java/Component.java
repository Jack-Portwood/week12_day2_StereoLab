public abstract class Component {

    protected String track;
    protected String make;
    protected String model;

    public Component(String make, String model) {this.track = " "; this.make = make; this.model = make; }

    public String getTrack() {
        return track;
    }
}
