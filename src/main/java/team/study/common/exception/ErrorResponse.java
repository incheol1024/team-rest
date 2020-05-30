package team.study.common.exception;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
public class ErrorResponse {

    /**
     * title - 사람이 읽을 수 있는 간단한 에러에 대한 메세지
     *
     * status - HTTP 응답 코드 (optional)
     *
     * detail - 사람이 읽을 수 있는 에러에 대한 설명
     *
     * intance - 에러가 발생한 URI
     *
    */

    private String type;

    private String title;

    private int status;

    private String detail;

    private String instance;

}
