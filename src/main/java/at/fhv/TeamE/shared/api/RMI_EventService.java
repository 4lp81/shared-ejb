package at.fhv.TeamE.shared.api;

import at.fhv.TeamE.shared.dto.EventOverviewDTO;


import javax.ejb.Remote;
import java.util.List;

@Remote
public interface RMI_EventService {
    List<EventOverviewDTO> searchArtistOrEvent(String searchString);
    List<EventOverviewDTO> filterTheatre();
    List<EventOverviewDTO> filterConcert();
    List<EventOverviewDTO> filterFestival();

}
