package org.Riccardo.DTO;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeDTO {

    private String code;
    private String fullname;

    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate startdate;

    public LocalDate getStartDate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullname(String fullName) {
        this.fullname = fullName;
    }

}
