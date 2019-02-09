package company.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reservation {

    private LocalDate reservationDate;
    private Client client;
    private Car car;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Department startDepartment;
    private Department endDepartment;
    private double finalCost;


}
