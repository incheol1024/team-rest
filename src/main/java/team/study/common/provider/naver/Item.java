package team.study.common.provider.naver;

public class Item {

    /**
     * 상품군 정보를 일반상품, 중고상품, 단종상품, 판매예정상품으로 구분한다. 상품군의 종류는 다음과 같다.
     * 일반상품
     * 중고상품
     * 단종상품
     * 판매예정상품
     */
    private int productType; //
    private String maker; //	string	해당 상품의 제조사 명이다.
    private String brand; //	string	해당 상품의 브랜드 명이다.
    private String category1; //	string	해당 상품의 카테고리, 대분류이다.
    private String category2; //	string	해당 상품의 카테고리, 중분류이다.
    private String category3l; //	string	해당 상품의 카테고리, 소분류이다.
    private String category4; //	string	해당 상품의 카테고리, 세분류이다.

}


