package company.domain;

public enum CarStatusEnum {
    RENTED("RENTED"),
    AVAIABLE("AVEABLE"),
    NOTAVAIABLE("NOTAVAIABLE");

    private final String value;

    CarStatusEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
