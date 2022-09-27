package com.xiangcai.fry;

import org.springframework.stereotype.Component;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="bars")
@Data
public class Bar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
}