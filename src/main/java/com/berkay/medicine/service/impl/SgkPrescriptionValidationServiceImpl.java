package com.berkay.medicine.service.impl;

import com.berkay.medicine.service.PrescriptionValidationService;
import org.springframework.stereotype.Service;

public class SgkPrescriptionValidationServiceImpl implements PrescriptionValidationService {
  @Override
  public boolean isValidPrescription(String tcNo, String prescriptionCode) {

    System.out.println("🔍 SGK Sistemine bağlanılıyor... TC: " + tcNo + " Reçete: " + prescriptionCode);

    if (prescriptionCode != null && prescriptionCode.startsWith("REC") && prescriptionCode.length() > 5) {
      System.out.println("✅ Reçete DOĞRULANDI!");
      return true;
    }
    System.out.println("❌ Reçete GEÇERSİZ!");
    return false;
  }
}
