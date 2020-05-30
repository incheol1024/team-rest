package team.study.common.provider.naver;

public interface NaverSearchProvider<T,R> extends NaverProvider{

    String QUERY = "query";

    String DISPLAY = "display";

    String START = "start";

    String SORT = "sort";


    R search(T request);




}
