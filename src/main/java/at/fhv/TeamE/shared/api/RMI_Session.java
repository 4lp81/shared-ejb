package at.fhv.TeamE.shared.api;


import javax.ejb.Remote;

@Remote
public interface RMI_Session {
    boolean authenticated(String username, String password);

    //ToDo: Add messaging in later stages
    String username();
    RMI_CustomerService rmi_customerService();

    RMI_EventService rmi_eventService();
    RMI_SaleService rmi_saleService();

    RMI_MessageConsumerService rmi_messageConsumerService();
    RMI_MessagePublisherService rmi_messagePublisherService();
}