package com.example.les12services.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TeacherDto {
    public Long id;

    @NotBlank
    public String firstName;

    @Size(min = 3, max = 255)
    public String lastName;

    @Past
    public LocalDate dob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank String firstName) {
        this.firstName = firstName;
    }

    public @Size(min = 3, max = 255) String getLastName() {
        return lastName;
    }

    public void setLastName(@Size(min = 3, max = 255) String lastName) {
        this.lastName = lastName;
    }

    public @Past LocalDate getDob() {
        return dob;
    }

    public void setDob(@Past LocalDate dob) {
        this.dob = dob;
    }
}
