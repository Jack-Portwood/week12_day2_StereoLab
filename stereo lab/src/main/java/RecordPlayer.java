public class RecordPlayer extends Component implements IPlay {

    public int playSpeed;



    public RecordPlayer (int playSpeed, String make, String model){
        super(make, model);
        this.playSpeed = playSpeed;

    }
    public void play(String track){
        this.track = track;
    }





}
