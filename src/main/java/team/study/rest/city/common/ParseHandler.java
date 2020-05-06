package team.study.rest.city.common;

import team.study.rest.city.dto.CityCovidResponse;

import java.net.URI;
import java.util.List;

public interface ParseHandler {

    // 공통으로 사용할 경우 Model을 와일드카드 혹은 Generics로 변경하여 동적으로 사용
    List<CityCovidResponse> parse(URI uri);
}