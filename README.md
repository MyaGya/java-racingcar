# java-racingcar
자동차 경주 게임 미션 저장소

# 미션 - 자동차 경주 게임
## 🗺 기본 로직
1. 사용자로부터 자동차 이름들을 입력받는다  
   1-1. 사용자가 입력한 자동차 이름들의 유효성 검사. 실패시 1번으로
2. 시도할 회수(총 라운드)를 입력받는다  
   2-1. 사용자가 입력한 회수의 유효성 검사. 실패시 2번으로
3. 각 라운드마다 자동차의 연료를 생성(랜덤값 생성)하고 조건에 맞는 자동차만 전진
   3-1. 각 라운드의 결과를 출력한다
4. 최종 우승자 출력

## 📝 구현 기능 목록
- 랜덤 기능을 구현한다
    - 랜덤 숫자는 0~9까지의 숫자만을 생성한다
    
- 자동자 이름들을 입력받는다
    - 쉼표를 구분자로 삼아 자동차의 이름들을 **Split()** 한다
    
- 입력받은 자동차의 이름들로 자동채 객체로 생성한다
    - 자동차의 이름에 공백이 들어갈 수 없다
    - 자동차의 이름이 5글자를 초과할 수 없다
    
- 시도할 회수를 입력받는다
    - 시도할 횟수에 공백이나 숫자가 아닌 문자가 올 수 없다.
    
- 입력받은 시도 회수(총 라운드)동안 자동차는 전진 혹은 멈춘다
    - 연료(랜덤 값)가 4 이상일 경우 자동차 전진, 3 이하일 경우 전지하지않는다
  
- 진행 라운드가 끝나면 라운드의 결과를 출력한다
    
- 우승자를 구한 후 출력한다
    - 우승자들의 목록에서 괄호(`[`, `]`)를 제거한 후 출력한다

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
