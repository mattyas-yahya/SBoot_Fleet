package com.matt.templateQ.TemplateSpringBoot2.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
@Getter @Setter @NoArgsConstructor
@Entity
public class services

{
        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        @Column(name = "id_services", unique = true, nullable = false)
        private String id_services;
        private String id_vehicles;

        private String description;
                private String vehicle;
        private String service_type;
   @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name="service_date")
        @Temporal(TemporalType.DATE)
        private Date service_date;
     private String cost;
          private String vendor;
     private String driver;
          private String odometer_value;
               private String notes;
    }



