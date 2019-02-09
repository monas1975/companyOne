package company.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private String firstName;
    private String lastName;
    private boolean isManager;
    private  Department department;

}
