package org.book_recommend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorModel 
{
  private int id;
  private String name;
  private String qual;
  private int exp;
}
