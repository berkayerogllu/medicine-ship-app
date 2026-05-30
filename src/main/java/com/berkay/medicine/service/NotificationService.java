package com.berkay.medicine.service;

import com.berkay.medicine.model.PharmacyOrder;

public interface NotificationService {

  void sendOrderConfirmation(PharmacyOrder order);
}
