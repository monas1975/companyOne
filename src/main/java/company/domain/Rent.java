package company.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Rent {

    private Employee employee;
    private LocalDate rentDate;
    private Reservation reservation;
    private String additionalInfo;
}
