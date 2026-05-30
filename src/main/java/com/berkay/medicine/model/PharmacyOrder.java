package com.berkay.medicine.model;

import java.util.List;

import lombok.Data;

@Data
public class PharmacyOrder {
  private String orderId;
  private String customerTcNo;
  private String prescriptionCode;
  private List<Medicine> medicines;
  private double totalAmount;
}
