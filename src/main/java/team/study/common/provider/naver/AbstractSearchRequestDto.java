package team.study.common.provider.naver;

import lombok.Data;

/**
 *
 * <p>
 *
 * @author Hwang In Cheol
 * @since 1.0
 * @version 1.0
 *
 */
@Data
public abstract class AbstractSearchRequestDto {

    protected String query;

    protected String display;

    protected String start;

    protected String sort;


}
