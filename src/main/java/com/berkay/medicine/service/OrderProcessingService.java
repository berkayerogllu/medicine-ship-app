package com.berkay.medicine.service;

import com.berkay.medicine.model.PharmacyOrder;

public interface OrderProcessingService {

  PharmacyOrder processOrder(PharmacyOrder order);
}
