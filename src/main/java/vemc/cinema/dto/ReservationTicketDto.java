package vemc.cinema.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vemc.cinema.dto.helperdto.ReservationHelperDto;
import vemc.cinema.dto.helperdto.ReservationTicketHelperDto;
import vemc.cinema.dto.helperdto.TicketHelperDto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationTicketDto {
    private List<ReservationTicketHelperDto> tickets = new ArrayList<>();
}
