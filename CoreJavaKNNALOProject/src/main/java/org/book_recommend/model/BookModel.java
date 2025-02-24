package org.book_recommend.model;

import java.sql.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookModel
{
   private int bid;
   private String bname;
   private float price;
   private String pyear;
   private String briefdesc;
}
