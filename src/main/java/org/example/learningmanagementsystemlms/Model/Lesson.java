package org.example.learningmanagementsystemlms.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 500)
    private String content;

    @ManyToOne
    @JoinColumn(name = "crs_id", nullable = false)
    private Course course;


    // Getters and Setters
}