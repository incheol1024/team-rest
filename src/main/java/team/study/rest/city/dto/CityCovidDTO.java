package team.study.rest.city.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "body")
public class CityCovidDTO {

    private List<CityCovidResponse> responses;

    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    public List<CityCovidResponse> getCityStatus() {
        return this.responses;
    }
}
