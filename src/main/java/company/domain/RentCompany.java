package company.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
//@Builder
public class RentCompany {

    private String name;
    private String website;
    private String address;
    private String owner;
    private String logotype;
    private ArrayList<Department> departments;

    public RentCompany() {
    }

    public RentCompany(String name, String website, String address, String owner, String logotype) {
        this.name = name;
        this.website = website;
        this.address = address;
        this.owner = owner;
        this.logotype = logotype;
        this.departments = new ArrayList<>();
    }







}



