package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee's First Name is not valid.")
    public String name;
    @Min(value = 500, message = "Salary should be more than 500")
    public long salary;

    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    public LocalDate startDate;

    public String note;

    public String profilePic;

    public List<String> departments;
}