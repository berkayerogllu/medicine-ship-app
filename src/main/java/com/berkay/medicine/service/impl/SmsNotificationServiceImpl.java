package com.berkay.medicine.service.impl;

import com.berkay.medicine.model.PharmacyOrder;
import com.berkay.medicine.service.NotificationService;

public class SmsNotificationServiceImpl implements NotificationService {

  @Override
  public void sendOrderConfirmation(PharmacyOrder order) {
    System.out.println("📱 SMS GÖNDERİLDİ!");
    System.out.println("Alıcı TC: " + order.getCustomerTcNo());
    System.out.println("Sipariş No: " + order.getOrderId());
    System.out.println("Tutar: " + order.getTotalAmount() + " TL");
    System.out.println("Mesaj: İlaç siparişiniz onaylanmıştır. Sağlıklı günler dileriz!");
    System.out.println("--------------------------------------------------");
  }
}
