package com.studentsubjectmark.studentmarks.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentMarks {

    @Id
    private int markId;

    private int marks;
    private int year;
    private String month;

    @OneToOne(cascade = CascadeType.ALL)
    private Student student;
}
