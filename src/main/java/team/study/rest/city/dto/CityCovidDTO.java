package team.study.rest.city.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * XML Binding Model
 */
@Getter
@Setter
//@XmlRootElement(name = "body")
@XmlRootElement(name = "response")
public class CityCovidDTO {

    private List<CityCovidResponse> responses;
    private String resultCode;

    // test하기 위해 response 코드 binding
    @XmlElement(name = "resultCode")
    public String getResultCode() {
        return this.resultCode;
    }

    // XmlElementWrapper로 묶음을 Binding 함
    // XmlElement로 묶음 안에 각 단위를 Binding 함.
//    @XmlElementWrapper(name = "items")
//    @XmlElement(name = "item")
    public List<CityCovidResponse> getCityStatus() {
        return this.responses;
    }
}
