package Serialization;

import java.io.Serializable;

public class Student implements Serializable{ 
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    transient String job;

    Student(int id, String name,String job){ {
        this.id = id;
        this.name = name;
        this.job=job;
    }
}
}
