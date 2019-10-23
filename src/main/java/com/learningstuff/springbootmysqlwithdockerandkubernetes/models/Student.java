package com.learningstuff.springbootmysqlwithdockerandkubernetes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ৯/১০/১৯
 * Time: ৮:৩২ AM
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    private long studentId;
    private String name;
    private String address;
    private double cgpa;

}
