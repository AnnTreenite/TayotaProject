package Car.Details;

public abstract class GasTank extends Detail {
    private int volume;
    public GasTank() {
        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
