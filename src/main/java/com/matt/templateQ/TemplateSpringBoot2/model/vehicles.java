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
public class vehicles

{
        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        @Column(name = "id_vehicles", unique = true, nullable = false)
        private String id_vehicles;
        private String model;
        @NotEmpty
        @Size(min=1, max=30)
        @Column(unique=true)
        private String license_plat;


        //driver detail
        private String driver;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name="assignment_date")
        @Temporal(TemporalType.DATE)
        private Date assignment_date;

        //vehicle
  private String category;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name="order_date")
        @Temporal(TemporalType.DATE)
        private Date order_date;
              @Column(unique=true)
         private String chassis_number;
         private String fleet_manager;
         private String location;

         //contract
            @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Column(name="firstcontractdate")
        @Temporal(TemporalType.DATE)
        private Date first_contract_date;
        String purchase_value;
        String residual_value;
    }



