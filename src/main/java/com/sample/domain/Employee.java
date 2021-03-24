package com.sample.domain;

import lombok.Builder;
import lombok.Data;

/**
 * User: rajeshgupta
 * Date: 08/03/21
 */
@Data
@Builder
public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private long salary;
}
