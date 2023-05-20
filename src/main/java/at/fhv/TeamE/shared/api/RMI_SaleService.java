package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.SaleDTO;
import at.fhv.TeamE.shared.dto.SaleHistoryDTO;

import javax.ejb.Remote;
import java.util.List;
import java.util.UUID;

@Remote
public interface RMI_SaleService {
    void purchase(UUID customerId, List<SaleDTO> salesDTO);

    //ToDo: idk just to fix versionNR...
    void refund(UUID customerId, UUID saleId, List<SaleDTO> salesDTO);

    List<SaleHistoryDTO> getById(String searchString);

    List<SaleHistoryDTO> saleHistoryFull();
    List<SaleHistoryDTO> saleHistoryBy(String customerOrSaleId);
    SaleHistoryDTO saleDetail(UUID saleId);
}
