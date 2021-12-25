public enum Time {
    NOWS("и сейчас же"),
    NOWT("тут же"),
    THISTIME("и на этот раз"),
    GRADUALLY("Постепенно"),
    BYTHITIME("К этому времени ");

    private final String timeName;
    public String getTimeName(){
        return this.timeName;
    }

    Time (String timeName){
        this.timeName= timeName;
    }

    @Override
    public String toString(){
        return timeName;
    }
}
