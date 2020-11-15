package invoicing.service;

import invoicing.model.Invoice;

import java.util.List;

public class InvoiceService {

    public List<Invoice> generateInvoices() {
        var invoice = new Invoice();

        invoice.setAmount(20);
        return List.of(invoice);
    }
}
