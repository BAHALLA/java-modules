package delivery;

import invoicing.model.Invoice;
import invoicing.service.InvoiceService;

import java.lang.reflect.Method;
import java.util.List;

public class DeliveryService {

    private InvoiceService invoiceService = new InvoiceService();

    public void deliver() {
        List<Invoice> invoices = invoiceService.generateInvoices();
        invoices.forEach(System.out::println);
    }

    public void showProduct(String name) throws Exception {

        Class<?> c = Class.forName("reflection.Product");

        Method method = c.getMethod("setName", String.class);
        Object o = c.getDeclaredConstructor().newInstance();
        method.invoke(o, new Object[]{name});
        System.out.println(o);
    }
}
