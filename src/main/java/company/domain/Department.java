package company.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Department {
    private String address;
    private ArrayList<Employee> employees;
    private ArrayList<Car> carList;
}
