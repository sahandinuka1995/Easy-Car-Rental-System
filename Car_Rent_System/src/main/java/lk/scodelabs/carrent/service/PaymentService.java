package lk.scodelabs.carrent.service;

import lk.scodelabs.carrent.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    void savePayment(PaymentDTO dto);

    void updatePayment(PaymentDTO dto);

    PaymentDTO searchPayment(String id);

    void deletePayment(String id);

    List<PaymentDTO> getAllPayment();
}
