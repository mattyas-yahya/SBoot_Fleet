package com.matt.templateQ.TemplateSpringBoot2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity
public class contract 
{
          @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "uuid2")
        @Column(name = "id_contract", unique = true, nullable = false)
        private String id_contract;
        private String id_vehicles;
        String reference;
        String type;//leasing or omium
String vendor;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="contract_start_date", nullable=false)
    @Temporal(TemporalType.DATE)
Date contract_start_date;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="contract_expired_date", nullable=false)
    @Temporal(TemporalType.DATE)
Date contract_expired_date;
String responsible;
String vehicle;
String driver;
String activation_cost;
String recurring_cost;

      }
