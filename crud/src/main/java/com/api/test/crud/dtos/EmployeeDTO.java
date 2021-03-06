package com.api.test.crud.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    private long employeeId;

    private String employeeName;

    private String employeeAddress;
}
