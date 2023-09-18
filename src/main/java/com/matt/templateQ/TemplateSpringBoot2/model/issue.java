package com.matt.templateQ.TemplateSpringBoot2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.TemporalType;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
public class issue 
{
        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        @Column(name = "id_issue", unique = true, nullable = false)
        private String id_issue;    
        private String id_vehicles;
        private String model;
        private String license_plat;
        private String driver;
        String title;
        String description;
        String priority;
                @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name="due_date")
        @Temporal(TemporalType.DATE)
        private Date due_date;


}
