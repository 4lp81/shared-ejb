package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.CustomerOverviewDTO;

import java.rmi.Remote;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RMI_CustomerService extends Remote {
    List<CustomerOverviewDTO> searchCustomer(String searchString) throws Exception;

    Optional<CustomerOverviewDTO> getCustomer(UUID customerId) throws Exception;
}