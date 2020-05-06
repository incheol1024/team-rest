package team.study.rest.city.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 시도별 코로나 현황 API Response
 */
@Setter
@ApiModel
// XML item name을 Root Element로 지정
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityCovidResponse {

    @ApiModelProperty(value = "결과코드")
    private String resultCode;

    @ApiModelProperty(value = "결과메세지")
    private String resultMsg;

    @XmlElement(name = "pageNo")
    @ApiModelProperty(value = "페이지 수")
    private Integer pageNo;

    @XmlElement(name = "totalCount")
    @ApiModelProperty(value = "전체 결과 수")
    private Integer totalCount;

    @XmlElement(name = "seq")
    @ApiModelProperty(value = "게시글번호(국내 시도별 발생 현황 고유값")
    private Integer seq;

    @XmlElement(name = "createDt")
    @ApiModelProperty(value = "등록일시분초")
    private String createDt;

    @XmlElement(name = "deathCnt")
    @ApiModelProperty(value = "사망자 수")
    private Integer deathCnt;

    @XmlElement(name = "gubun")
    @ApiModelProperty(value = "시도명(한글)")
    private String gubun;

    @XmlElement(name = "gubunCn")
    @ApiModelProperty(value = "시도명(중국어)")
    private String gubunCn;

    @XmlElement(name = "gubunEn")
    @ApiModelProperty(value = "시도명(영어)")
    private String gubunEn;

    @XmlElement(name = "incDec")
    @ApiModelProperty(value = "전일대비 증감 수")
    private Integer incDec;

    @XmlElement(name = "isolClearCnt")
    @ApiModelProperty(value = "격리 해제 수")
    private Integer isolClearCnt;

    @XmlElement(name = "qurRate")
    @ApiModelProperty(value = "10만명당 발생률")
    private Integer qurRate;

    @XmlElement(name = "stdDay")
    @ApiModelProperty(value = "기준일시")
    private String stdDay;

    @XmlElement(name = "updateDt")
    @ApiModelProperty(value = "수정일시분초")
    private String updateDt;
}
