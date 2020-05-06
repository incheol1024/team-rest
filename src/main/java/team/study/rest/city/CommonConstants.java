package team.study.rest.city;

public class CommonConstants {

    // Secret Key
    public final static String KEY = "Pg505PSmcYhOgevQgu1I0nFKOvGqYml2o68imNrQoaqBfcv1g/VpIkHZssTJb00xoAEsb5LM4iwXTpyoZJTvuQ==";
    // 공공데이터 API END POINT
    public final static String END_POINT = "http://openapi.data.go.kr/openapi/service/rest/Covid19";
    // 시도별 코로나발병현황 Param
    public final static String SIDO_PARAM = "getCovid19SidoInfStateJson";
    // 코로나발병현황 Param
    public final static String INFECTION_PARAM = "getCovid19InfStateJson";
    // 성별 코로나발병현황 Param
    public final static String GENDER_PARAM = "getCovid19GenAgeCaseInfJson";
    // 해외 코로나발병현황 Param
    public final static String FOREIGN_INFECTION_PARAM = "getCovid19NatInfStateJson";
}
