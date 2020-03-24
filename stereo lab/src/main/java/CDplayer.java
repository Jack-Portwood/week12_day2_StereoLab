public class CDplayer extends Component implements IPlay {

    public int numCD;



    public CDplayer (int numCD, String make, String model){
        super(make, model);
        this.numCD = numCD;

    }
    public void play(String track){
        this.track = track;
    }


}
