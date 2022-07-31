package com.bridgelabz.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee's First Name is not valid.")
    public String name;

    @Min(value = 500, message = "Salary should be more than 500")
    public long salary;

    @Pattern(regexp = "female|male", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "startDate should Not be Empty")
    @PastOrPresent(message = "startDate should be past or present date")
    public LocalDate startDate;

    @NotEmpty(message = "ProfilePic cannot be null")
    public String note;

    @NotEmpty(message = "Department name cannot be null")
    public String profilePic;
    @NotEmpty(message = "Department name cannot be null")
    public List<String> departments;
}