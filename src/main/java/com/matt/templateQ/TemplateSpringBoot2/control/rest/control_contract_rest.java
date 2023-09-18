package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.matt.templateQ.TemplateSpringBoot2.model.*;
import com.matt.templateQ.TemplateSpringBoot2.repo.*;

import java.io.DataInputStream;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
@RequestMapping("contract")
@RestController
public class control_contract_rest
{
        @Autowired
        private repo_contract reco;

        @RequestMapping(path="All", method= RequestMethod.GET)
        public List<contract> getAll()
        {
            return (List)this.reco.findAll();
        }
@PostMapping("/Save")
  @ResponseBody()
  public void create_(@Valid contract v)
  {
     reco.save(v);
  }

  @DeleteMapping("/Delete")
  @Transactional
  @ResponseBody()
  public ResponseEntity<contract> Delete_(@RequestParam("id_contract")  String[] id_contract,  contract c)
  {
    reco.hapusdataAll(Arrays.asList(id_contract));
    return ResponseEntity.ok().build();
  }

    }


