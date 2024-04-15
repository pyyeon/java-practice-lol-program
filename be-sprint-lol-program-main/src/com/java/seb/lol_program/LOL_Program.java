package com.java.seb.lol_program;


public class LOL_Program {
  public static void main(String[] args) {
    //TODO://create()정보받기
    System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
    System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
    // 자신의 유닛 정보 입력 받기
    LoL_char playerUnit = new LoL_char();
    String[] playerInfo = playerUnit.user_create();
    // 자신의 유닛 정보 출력
    playerUnit.user_print(playerInfo);
    ////print(String[])정보 출력
    user_print(String[]);
    ////info_int(String[])
    user_info_int(String[]info);
    System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
    user_create(); //메소드 호출
    //객체 생성
    ////print(String[])정보 출력
    user_print(String[]);
    ////info_int(String[])
    user_info_int(String[]info);
    ////실행
    for (int i = 0; i <= 3; i++) {//3번까지 실행
      attack( int[] me_info_int, int[] enemy);
    }
  }

}