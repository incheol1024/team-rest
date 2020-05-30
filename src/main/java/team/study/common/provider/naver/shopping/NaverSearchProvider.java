package team.study.common.provider.naver.shopping;

import org.springframework.web.client.RestTemplate;
import team.study.common.provider.naver.NaverProvider;

@FunctionalInterface
public interface NaverSearchProvider<T,R> extends NaverProvider {

    R search(T request);




}
