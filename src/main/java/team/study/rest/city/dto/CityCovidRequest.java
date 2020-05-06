package team.study.rest.city.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Setter;

/**
 * 시도별 코로나현황 API 요청 Model
 */
@Setter
@ApiModel
public class CityCovidRequest {

    @ApiModelProperty(value = "한 페이지 결과 수")
    private Integer numOfRows;

    @ApiModelProperty(value = "페이지 번호")
    private Integer pageNo;

    @ApiModelProperty(value = "데이터 생성일 시작범위")
    private String startCreateDt;

    @ApiModelProperty(value = "데이터 생성일 종료범위")
    private String endCreateDt;
}
