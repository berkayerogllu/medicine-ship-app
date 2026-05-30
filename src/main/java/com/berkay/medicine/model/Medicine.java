package com.berkay.medicine.model;

import lombok.Data;

@Data
public class Medicine {
  private String id;
  private String name;
  private double price;
  private boolean isPrescriptionRequired;
}