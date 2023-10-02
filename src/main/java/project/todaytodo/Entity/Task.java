package project.todaytodo.Entity;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@RequiredArgsConstructor
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="task")
    private String task;

    @Column(name="preference_point")
    private int preference_point;

    @Column(name="importance_point")
    private int importance_point;

    @Column(name="done")
    private boolean done;

    @Column(name="date")
    private Date date;
}
