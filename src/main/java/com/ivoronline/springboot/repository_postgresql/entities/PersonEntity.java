package com.ivoronline.springboot.repository_postgresql.entities;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Component
public class PersonEntity {

  @Id
  private Integer id;
  private String  name;
  private Integer age;

}
