# Java 학습 로드맵

## 학습 목표
Java 언어의 기본 개념과 실무에서 필요한 핵심 기능을 학습하고 실습을 통해 검증한 후, 재사용 가능한 모듈로 구성한다.

## 학습 순서

### 1. Java 기본 개념 및 환경 설정
<details>
<summary>Java란 무엇인가?</summary>

- Java의 역사와 특징
- JVM, JRE, JDK의 차이점
- Java 버전별 주요 변경사항 (Java 8, 11, 17, 21)
- Java의 장단점
- 다른 언어와의 비교 (C++, Python, Kotlin 등)
</details>
<br/>

### 2. 기본 문법
<details>
<summary>변수, 데이터 타입, 연산자</summary>

- 변수 선언 및 초기화
- 기본 데이터 타입 (primitive types)
- 참조 데이터 타입 (reference types)
- 타입 변환 (casting)
- 연산자 (산술, 비교, 논리, 비트 등)
- 상수 (final)
</details>
<br/>

### 3. 제어문
<details>
<summary>조건문과 반복문</summary>

- if-else, switch
- for, while, do-while
- break, continue
- 향상된 for문 (enhanced for)
</details>
<br/>

### 4. 배열과 문자열
<details>
<summary>배열과 String 클래스</summary>

- 배열 선언 및 사용
- 다차원 배열
- String 클래스와 메서드
- StringBuffer, StringBuilder
- 문자열 비교 및 조작
</details>
<br/>

### 5. 객체지향 프로그래밍 기초
<details>
<summary>클래스와 객체</summary>

- 클래스와 객체의 개념
- 클래스 선언 및 인스턴스 생성
- 생성자 (constructor)
- 메서드 정의 및 호출
- this 키워드
- 접근 제어자 (public, private, protected, default)
</details>
<br/>

### 6. 객체지향 프로그래밍 심화
<details>
<summary>상속, 다형성, 캡슐화, 추상화</summary>

- 상속 (inheritance)
- 메서드 오버라이딩 (overriding)
- 메서드 오버로딩 (overloading)
- super 키워드
- 다형성 (polymorphism)
- 캡슐화 (encapsulation)
- 추상 클래스 (abstract class)
- 인터페이스 (interface)
- final 키워드
</details>
<br/>

### 7. 패키지와 접근 제어
<details>
<summary>패키지 시스템</summary>

- 패키지의 개념과 사용법
- import 문
- 접근 제어자와 패키지
- 클래스패스 (classpath)
</details>
<br/>

### 8. 예외 처리
<details>
<summary>Exception Handling</summary>

- 예외의 개념과 종류
- try-catch-finally
- throw, throws
- 사용자 정의 예외
- 예외 처리 전략
</details>
<br/>

### 9. 제네릭
<details>
<summary>Generic Programming</summary>

- 제네릭의 개념과 필요성
- 제네릭 클래스, 메서드
- 와일드카드 (?, extends, super)
- 제네릭의 제약사항
</details>
<br/>

### 10. 컬렉션 프레임워크
<details>
<summary>Collection Framework</summary>

- 컬렉션의 개념과 종류
- List (ArrayList, LinkedList, Vector)
- Set (HashSet, TreeSet, LinkedHashSet)
- Map (HashMap, TreeMap, LinkedHashMap, Hashtable)
- Iterator, ListIterator
- Collections 유틸리티 클래스
- 컬렉션 선택 가이드
</details>
<br/>

### 11. 람다 표현식과 함수형 인터페이스
<details>
<summary>Lambda Expressions</summary>

- 람다 표현식의 개념
- 함수형 인터페이스 (Functional Interface)
- 메서드 참조 (Method Reference)
- 기본 함수형 인터페이스 (Predicate, Function, Consumer, Supplier)
</details>
<br/>

### 12. 스트림 API
<details>
<summary>Stream API</summary>

- 스트림의 개념과 특징
- 스트림 생성
- 중간 연산 (filter, map, sorted 등)
- 최종 연산 (collect, forEach, reduce 등)
- 병렬 스트림
- 스트림 활용 예제
</details>
<br/>

### 13. Optional
<details>
<summary>Optional 클래스</summary>

- Optional의 개념과 필요성
- Optional 생성 및 사용
- Optional 메서드 (of, ofNullable, empty, isPresent, ifPresent 등)
- Optional 체이닝
</details>
<br/>

### 14. 날짜와 시간 API
<details>
<summary>Date and Time API</summary>

- 기존 Date/Calendar의 문제점
- LocalDate, LocalTime, LocalDateTime
- ZonedDateTime
- Period, Duration
- DateTimeFormatter
- 날짜/시간 연산
</details>
<br/>

### 15. 멀티스레딩
<details>
<summary>Multi-threading</summary>

- 프로세스와 스레드의 개념
- Thread 클래스와 Runnable 인터페이스
- 스레드 생명주기
- 동기화 (synchronized)
- wait, notify, notifyAll
- 동시성 컬렉션 (ConcurrentHashMap 등)
- ExecutorService
- CompletableFuture
</details>
<br/>

### 16. I/O 스트림
<details>
<summary>Input/Output Streams</summary>

- 스트림의 개념
- 바이트 스트림 (InputStream, OutputStream)
- 문자 스트림 (Reader, Writer)
- 파일 I/O
- NIO (New I/O)
- Files 클래스
</details>
<br/>

### 17. 리플렉션
<details>
<summary>Reflection</summary>

- 리플렉션의 개념
- Class 객체
- 필드, 메서드, 생성자 접근
- 동적 객체 생성 및 메서드 호출
- 리플렉션의 활용과 주의사항
</details>
<br/>

### 18. 어노테이션
<details>
<summary>Annotations</summary>

- 어노테이션의 개념
- 기본 제공 어노테이션 (@Override, @Deprecated, @SuppressWarnings)
- 사용자 정의 어노테이션
- 메타 어노테이션 (@Retention, @Target 등)
</details>
<br/>

### 19. 모듈 시스템 (Java 9+)
<details>
<summary>Java Module System</summary>

- 모듈 시스템의 개념과 필요성
- module-info.java
- 모듈 선언 및 사용
- 모듈 간 의존성 관리
</details>
<br/>

### 20. 실습 프로젝트
<details>
<summary>종합 실습</summary>

- 학습한 개념들을 활용한 실습 프로젝트
- 재사용 가능한 유틸리티 모듈 개발
- 모듈화 및 패키징
</details>
<br/>

## 학습 체크리스트

- [ ] Java 기본 개념 및 환경 설정
- [ ] 기본 문법
- [ ] 제어문
- [ ] 배열과 문자열
- [ ] 객체지향 프로그래밍 기초
- [ ] 객체지향 프로그래밍 심화
- [ ] 패키지와 접근 제어
- [ ] 예외 처리
- [ ] 제네릭
- [ ] 컬렉션 프레임워크
- [ ] 람다 표현식과 함수형 인터페이스
- [ ] 스트림 API
- [ ] Optional
- [ ] 날짜와 시간 API
- [ ] 멀티스레딩
- [ ] I/O 스트림
- [ ] 리플렉션
- [ ] 어노테이션
- [ ] 모듈 시스템
- [ ] 실습 프로젝트

