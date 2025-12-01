/**
 * 기본 문법 실습 예제
 * 
 * 이 파일은 Java의 기본 문법을 실습하기 위한 예제 코드입니다.
 * 변수, 데이터 타입, 연산자, 타입 변환 등을 다룹니다.
 * 
 * @author 학습자
 * @version 1.0
 */
public class 기본문법_실습예제 {
    
    /**
     * 프로그램 진입점
     */
    public static void main(String[] args) {
        System.out.println("=== 기본 문법 실습 예제 ===\n");
        
        // 1. 변수 선언 및 초기화
        변수예제();
        
        // 2. 기본 데이터 타입
        기본데이터타입예제();
        
        // 3. 참조 데이터 타입
        참조데이터타입예제();
        
        // 4. 타입 변환
        타입변환예제();
        
        // 5. 연산자
        연산자예제();
        
        // 6. 상수
        상수예제();
    }
    
    /**
     * 변수 선언 및 초기화 예제
     */
    public static void 변수예제() {
        System.out.println("--- 1. 변수 선언 및 초기화 ---");
        
        // 변수 선언
        int number;
        String name;
        
        // 변수 초기화
        number = 100;
        name = "Java";
        
        // 선언과 동시에 초기화
        int age = 25;
        String greeting = "Hello, World!";
        
        // 여러 변수 동시 선언
        int a = 10, b = 20, c = 30;
        
        System.out.println("number: " + number);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("greeting: " + greeting);
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println();
    }
    
    /**
     * 기본 데이터 타입 예제
     */
    public static void 기본데이터타입예제() {
        System.out.println("--- 2. 기본 데이터 타입 ---");
        
        // 정수형
        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 100000;           // 가장 많이 사용
        long longValue = 10000000000L;   // L 필수!
        
        // 실수형
        float floatValue = 3.14F;        // F 필수!
        double doubleValue = 3.14159;     // 가장 많이 사용
        
        // 문자형
        char charValue = 'A';
        char koreanChar = '한';
        char unicodeChar = '\u0041';     // 'A'
        
        // 논리형
        boolean isTrue = true;
        boolean isFalse = false;
        
        System.out.println("정수형:");
        System.out.println("  byte: " + byteValue);
        System.out.println("  short: " + shortValue);
        System.out.println("  int: " + intValue);
        System.out.println("  long: " + longValue);
        
        System.out.println("실수형:");
        System.out.println("  float: " + floatValue);
        System.out.println("  double: " + doubleValue);
        
        System.out.println("문자형:");
        System.out.println("  char: " + charValue);
        System.out.println("  한글: " + koreanChar);
        System.out.println("  유니코드: " + unicodeChar);
        
        System.out.println("논리형:");
        System.out.println("  true: " + isTrue);
        System.out.println("  false: " + isFalse);
        System.out.println();
    }
    
    /**
     * 참조 데이터 타입 예제
     */
    public static void 참조데이터타입예제() {
        System.out.println("--- 3. 참조 데이터 타입 ---");
        
        // String 클래스
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String: " + str1 + " " + str2);
        
        // 배열
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.println("배열 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        System.out.println("배열 names:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        
        // 참조 타입의 특징 (주소 복사)
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;  // 주소 복사
        arr2[0] = 100;
        System.out.println("arr1[0]: " + arr1[0]);  // 100 (같은 객체 참조)
        System.out.println();
    }
    
    /**
     * 타입 변환 예제
     */
    public static void 타입변환예제() {
        System.out.println("--- 4. 타입 변환 ---");
        
        // 자동 타입 변환 (작은 타입 → 큰 타입)
        byte b = 100;
        int i = b;          // 자동 변환
        long l = i;         // 자동 변환
        float f = l;         // 자동 변환
        double d = f;        // 자동 변환
        
        System.out.println("자동 타입 변환:");
        System.out.println("  byte " + b + " → int " + i);
        System.out.println("  int " + i + " → long " + l);
        System.out.println("  long " + l + " → float " + f);
        System.out.println("  float " + f + " → double " + d);
        
        // 강제 타입 변환 (큰 타입 → 작은 타입)
        double pi = 3.14159;
        int integer = (int) pi;  // 소수점 손실
        float floatValue = (float) pi;
        
        System.out.println("강제 타입 변환:");
        System.out.println("  double " + pi + " → int " + integer);
        System.out.println("  double " + pi + " → float " + floatValue);
        
        // 연산 시 타입 변환
        int a = 10;
        double b2 = 3.0;
        double result = a + b2;  // int가 double로 자동 변환
        System.out.println("연산 시 타입 변환: " + a + " + " + b2 + " = " + result);
        System.out.println();
    }
    
    /**
     * 연산자 예제
     */
    public static void 연산자예제() {
        System.out.println("--- 5. 연산자 ---");
        
        int a = 10;
        int b = 3;
        
        // 산술 연산자
        System.out.println("산술 연산자:");
        System.out.println("  " + a + " + " + b + " = " + (a + b));
        System.out.println("  " + a + " - " + b + " = " + (a - b));
        System.out.println("  " + a + " * " + b + " = " + (a * b));
        System.out.println("  " + a + " / " + b + " = " + (a / b));
        System.out.println("  " + a + " % " + b + " = " + (a % b));
        
        // 비교 연산자
        System.out.println("비교 연산자:");
        System.out.println("  " + a + " == " + b + ": " + (a == b));
        System.out.println("  " + a + " != " + b + ": " + (a != b));
        System.out.println("  " + a + " > " + b + ": " + (a > b));
        System.out.println("  " + a + " < " + b + ": " + (a < b));
        
        // 논리 연산자
        boolean x = true;
        boolean y = false;
        System.out.println("논리 연산자:");
        System.out.println("  " + x + " && " + y + ": " + (x && y));
        System.out.println("  " + x + " || " + y + ": " + (x || y));
        System.out.println("  !" + x + ": " + (!x));
        
        // 증감 연산자
        int num = 5;
        System.out.println("증감 연산자:");
        System.out.println("  num = " + num);
        System.out.println("  num++: " + (num++));  // 5 출력, num은 6
        System.out.println("  num: " + num);
        System.out.println("  ++num: " + (++num));  // 7 출력, num은 7
        
        // 삼항 연산자
        int score = 85;
        String grade = (score >= 90) ? "A" : 
                      (score >= 80) ? "B" : 
                      (score >= 70) ? "C" : "F";
        System.out.println("삼항 연산자:");
        System.out.println("  점수 " + score + "점의 등급: " + grade);
        System.out.println();
    }
    
    /**
     * 상수 예제
     */
    public static void 상수예제() {
        System.out.println("--- 6. 상수 (final) ---");
        
        // 지역 상수
        final int MAX_COUNT = 100;
        final String GREETING = "Hello, Java!";
        final double PI = 3.14159;
        
        System.out.println("상수 값:");
        System.out.println("  MAX_COUNT: " + MAX_COUNT);
        System.out.println("  GREETING: " + GREETING);
        System.out.println("  PI: " + PI);
        
        // 상수 활용 예제
        int radius = 5;
        double area = PI * radius * radius;
        System.out.println("반지름 " + radius + "인 원의 넓이: " + area);
        
        // 클래스 상수 사용 예시
        System.out.println("클래스 상수:");
        System.out.println("  Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("  Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println();
    }
}

