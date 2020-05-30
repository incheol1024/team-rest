package team.study.common.provider.naver;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ShoppingSearchResultDto {

    private String rss;    //-	디버그를 쉽게 하고 RSS 리더기만으로 이용할 수 있게 하기 위해 만든 RSS 포맷의 컨테이너이며 그 외의 특별한 의미는 없다.
    private String channel; //	-	검색 결과를 포함하는 컨테이너이다. 이 안에 있는 title, link, description 등의 항목은 참고용으로 무시해도 무방하다.
    private LocalDateTime lastBuildDate; //	datetime	검색 결과를 생성한 시간이다.
    private int total; //	integer	검색 결과 문서의 총 개수를 의미한다.
    private int start; //	integer	검색 결과 문서 중, 문서의 시작점을 의미한다.
    private int display; //	integer	검색된 검색 결과의 개수이다.
    private Item items;        //XML 포멧에서는 item 태그로, JSON 포멧에서는 items 속성으로 표현된다. 개별 검색 결과이며 title, link을 포함한다.
    private String title; //	string	검색 결과 문서의 제목을 나타낸다. 제목에서 검색어와 일치하는 부분은 태그로 감싸져 있다.
    private String link; //	string	검색 결과 문서의 하이퍼텍스트 link를 나타낸다.
    private String image; //	string	썸네일 이미지의 URL이다. 이미지가 있는 경우만 나타난다.
    private int lprice; //	integer	최저가 정보이다. 최저가 정보가 없는 경우 0으로 표시되며, 가격비교 데이터가 없는 경우 이 필드는 가격을 나타낸다.
    private int hprice;//	integer	최고가 정보이다. 최고가 정보가 없거나 가격비교 데이터가 없는 경우 0으로 표시된다.
    private String mallName; //	string	상품을 판매하는 쇼핑몰의 상호이다. 정보가 없을 경우 네이버로 표기된다.
    private int productId; //	integer	해당 상품에 대한 ID 이다.
}
