package team.study.rest.sample.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@ApiModel
@NoArgsConstructor
public class CovidResponseDto {

    @ApiModelProperty(value = "데이터를 수직한 시점", dataType = "int")
    int timestamp;

    @ApiModelProperty(value = "데이터가 발표된 시점", dataType = "int")
    int announcedTimestamp;

    @ApiModelProperty(value = "늘어난 환자의 수", dataType = "int")
    int increased;

    @ApiModelProperty(value = "확진된 환자의 수", dataType = "int")
    int certified;

    @ApiModelProperty(value = "격리해제된 환자의 수", dataType = "int")
    int deisolated;

    @ApiModelProperty(value = "사망한 환자의 수", dataType = "int")
    int dead;

    @ApiModelProperty(value = "감영률", dataType = "float")
    int percentage;
}
