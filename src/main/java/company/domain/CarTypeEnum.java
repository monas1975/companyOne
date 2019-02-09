package company.domain;

public enum CarTypeEnum {
    COMBI("COMBI"),
    HATCHBACK("HATCHBACK"),
    SEDAN("SEDAN"),
    PICKUP("PICKUP");

    private final String value;

    CarTypeEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
