package team.study.rest.city.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class CityCovidResponse {

    @ApiModelProperty(value = "결과코드")
    private String resultCode;

    @ApiModelProperty(value = "결과메세지")
    private String resultMsg;

    @ApiModelProperty(value = "페이지 수")
    private Integer pageNo;

    @ApiModelProperty(value = "전체 결과 수")
    private Integer totalCount;

    @ApiModelProperty(value = "게시글번호(국내 시도별 발생 현황 고유값")
    private Integer seq;

    @ApiModelProperty(value = "등록일시분초")
    private String createDt;

    @ApiModelProperty(value = "사망자 수")
    private Integer deathCnt;

    @ApiModelProperty(value = "시도명(한글)")
    private String gubun;

    @ApiModelProperty(value = "시도명(중국어)")
    private String gubunCn;

    @ApiModelProperty(value = "시도명(영어)")
    private String gubunEn;

    @ApiModelProperty(value = "전일대비 증감 수")
    private Integer incDec;

    @ApiModelProperty(value = "격리 해제 수")
    private Integer isolClearCnt;

    @ApiModelProperty(value = "10만명당 발생률")
    private Integer qurRate;

    @ApiModelProperty(value = "기준일시")
    private String stdDay;

    @ApiModelProperty(value = "수정일시분초")
    private String updateDt;
}
