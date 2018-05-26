package com.workout.j9.j9workout.business;

import java.util.function.Function;

@FunctionalInterface
public interface PersistEmployee {
    void saveEmployee(Long id, String firstName, String lastName, int age, boolean isDev);
}
