# 1. Java 기본 개념 및 환경 설정

## Java란 무엇인가?

<details>
<summary>Java의 역사와 특징</summary>

### Java의 역사

- **1991년**: 제임스 고슬링(James Gosling)이 썬 마이크로시스템즈(Sun Microsystems)에서 시작
- **1995년**: Java 1.0 공식 발표 (Oak라는 이름에서 Java로 변경)
- **2009년**: 오라클(Oracle)이 썬 마이크로시스템즈 인수
- **2018년**: Java 11 출시 (LTS - Long Term Support)
- **2021년**: Java 17 출시 (LTS)
- **2023년**: Java 21 출시 (LTS)

### Java의 주요 특징

1. **플랫폼 독립성 (Platform Independence)**

   - "Write Once, Run Anywhere" (WORA) 철학
   - JVM을 통해 운영체제에 상관없이 실행 가능

2. **객체지향 프로그래밍 (OOP)**

   - 클래스와 객체 기반 프로그래밍
   - 상속, 다형성, 캡슐화, 추상화 지원

3. **자동 메모리 관리 (Garbage Collection)**

   - 개발자가 직접 메모리를 관리할 필요 없음
   - JVM이 자동으로 사용하지 않는 메모리 회수

4. **멀티스레딩 지원**

   - 동시에 여러 작업을 수행할 수 있는 기능 내장

5. **안전성 (Security)**

   - 바이트코드 검증
   - 샌드박스 보안 모델

6. **풍부한 표준 라이브러리**
   - Java API가 다양한 기능 제공
   - 서드파티 라이브러리 생태계 발달
   </details>
   <br/>

## JVM, JRE, JDK의 차이점

<details>
<summary>JVM, JRE, JDK 개념과 차이점</summary>

### JVM (Java Virtual Machine)

- **역할**: Java 바이트코드를 실행하는 가상 머신
- **기능**:
  - 바이트코드를 기계어로 변환 (JIT 컴파일)
  - 메모리 관리 (Garbage Collection)
  - 플랫폼별로 다른 JVM 구현체 존재 (Windows, Linux, macOS 등)
- **포함 내용**: JVM 자체만 포함

### JRE (Java Runtime Environment)

- **역할**: Java 프로그램을 실행하기 위한 환경
- **구성 요소**:
  - JVM
  - Java 클래스 라이브러리 (rt.jar 등)
  - 기타 실행에 필요한 파일들
- **용도**: Java 프로그램 실행만 필요할 때 사용
- **포함 내용**: JVM + 라이브러리

### JDK (Java Development Kit)

- **역할**: Java 프로그램을 개발하기 위한 도구 모음
- **구성 요소**:
  - JRE (JVM + 라이브러리)
  - 컴파일러 (javac)
  - 디버거 (jdb)
  - 문서 생성 도구 (javadoc)
  - 기타 개발 도구들
- **용도**: Java 프로그램 개발 시 필요
- **포함 내용**: JRE + 개발 도구

### 관계도

```
JDK = JRE + 개발 도구
JRE = JVM + 라이브러리
JDK ⊃ JRE ⊃ JVM
```

### 설치 확인 명령어

```bash
# JDK 버전 확인
javac -version

# JRE 버전 확인
java -version
```

</details>
<br/>

## JVM 동작 원리

<details>
<summary>JVM의 컴파일 및 실행 과정</summary>

### 컴파일 과정

1. **소스 코드 작성** (.java 파일)
2. **컴파일** (javac 명령어)
   - 소스 코드를 바이트코드(.class 파일)로 변환
   - 바이트코드는 플랫폼 독립적인 중간 코드
3. **실행** (java 명령어)
   - JVM이 바이트코드를 읽어서 실행
   - JIT(Just-In-Time) 컴파일러가 바이트코드를 기계어로 변환

### JVM 내부 구조

- **클래스 로더 (Class Loader)**: 클래스 파일을 메모리에 로드
- **실행 엔진 (Execution Engine)**: 바이트코드를 실행
- **런타임 데이터 영역 (Runtime Data Area)**: 메모리 관리
  - Method Area: 클래스 정보 저장
  - Heap: 객체 저장 (GC 대상)
  - Stack: 메서드 호출 정보 저장
  - PC Register: 현재 실행 중인 명령어 주소
  - Native Method Stack: 네이티브 메서드 정보
  </details>
  <br/>

## Java 프로그램 실행 과정

<details>
<summary>소스 코드부터 실행까지의 단계</summary>

### 실행 단계별 설명

1. **소스 코드 작성**

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello");
       }
   }
   ```

2. **컴파일**

   ```bash
   javac HelloWorld.java
   ```

   - HelloWorld.class 파일 생성 (바이트코드)

3. **실행**
   ```bash
   java HelloWorld
   ```
   - JVM이 HelloWorld.class 파일을 로드
   - main 메서드를 찾아서 실행

### 클래스 파일 구조

- 바이트코드는 플랫폼 독립적
- JVM이 설치된 모든 운영체제에서 실행 가능
- 바이트코드는 16진수로 표현됨
</details>
<br/>

## Java 버전별 주요 변경사항

<details>
<summary>Java 8, 11, 17, 21 주요 변경사항</summary>

### Java 8 (2014년 3월)

- **람다 표현식 (Lambda Expressions)**: 함수형 프로그래밍 지원
- **스트림 API (Stream API)**: 컬렉션 처리 개선
- **Optional 클래스**: NullPointerException 방지
- **새로운 날짜/시간 API**: java.time 패키지
- **인터페이스 기본 메서드 (Default Methods)**: 인터페이스에 구현 메서드 추가 가능
- **메서드 참조 (Method References)**: 메서드를 직접 참조

### Java 11 (2018년 9월) - LTS

- **로컬 변수 문법 (var 키워드)**: 타입 추론 강화
- **String 메서드 추가**: `isBlank()`, `lines()`, `strip()` 등
- **Files 클래스 개선**: `readString()`, `writeString()` 추가
- **HTTP 클라이언트 API**: 표준 HTTP 클라이언트 제공
- **Epsilon 가비지 컬렉터**: 실험적 GC 추가
- **ZGC (실험적)**: 저지연 가비지 컬렉터

### Java 17 (2021년 9월) - LTS

- **Sealed 클래스**: 상속을 제한할 수 있는 클래스
- **Pattern Matching for switch**: switch 표현식 개선
- **텍스트 블록 (Text Blocks)**: 멀티라인 문자열 개선
- **Records**: 불변 데이터 클래스 간소화
- **Foreign Function & Memory API**: 네이티브 코드 접근
- **ZGC, Shenandoah GC**: 프로덕션 사용 가능

### Java 21 (2023년 9월) - LTS

- **Virtual Threads (가상 스레드)**: 경량 스레드 모델
- **Pattern Matching for switch 완성**: 모든 패턴 지원
- **Record Patterns**: 레코드 분해 패턴
- **String Templates (Preview)**: 문자열 템플릿 기능
- **Sequenced Collections**: 순서가 있는 컬렉션 인터페이스
- **Generational ZGC**: 세대별 ZGC 개선

### LTS (Long Term Support) 버전

- **LTS 버전**: 장기 지원 버전 (보통 3년마다 출시)
- **일반 버전**: 6개월마다 출시, 6개월 지원
- **권장**: 프로덕션 환경에서는 LTS 버전 사용 권장
- **LTS 버전**: Java 8, 11, 17, 21 등
</details>
<br/>

## Java의 장단점

<details>
<summary>Java 언어의 장점과 단점</summary>

### 장점

1. **플랫폼 독립성**

   - 한 번 작성하면 어디서든 실행 가능
   - 크로스 플랫폼 개발 용이

2. **풍부한 생태계**

   - 방대한 표준 라이브러리
   - 다양한 서드파티 라이브러리 (Maven, Gradle 등)
   - 활발한 커뮤니티

3. **안정성**

   - 엄격한 타입 체크
   - 자동 메모리 관리
   - 예외 처리 메커니즘

4. **성능**

   - JIT 컴파일러로 실행 시 최적화
   - 가비지 컬렉터 개선으로 성능 향상

5. **기업용 애플리케이션에 적합**

   - 대규모 프로젝트에 적합
   - 유지보수 용이
   - 많은 기업에서 사용

6. **멀티스레딩 지원**
   - 동시성 프로그래밍 내장 지원
   - 병렬 처리 용이

### 단점

1. **메모리 사용량**

   - JVM 오버헤드로 메모리 사용량이 큼
   - 작은 애플리케이션에는 과할 수 있음

2. **시작 속도**

   - JVM 시작 시간이 필요
   - 작은 스크립트에는 부적합

3. **코드 장황함**

   - 다른 언어에 비해 코드가 길 수 있음
   - 보일러플레이트 코드 존재

4. **성능 오버헤드**

   - JVM을 통한 실행으로 네이티브 코드보다 느릴 수 있음
   - 하지만 JIT 컴파일러로 대부분 해결

5. **라이선스 이슈**
   - 과거 오라클 라이선스 문제 (현재는 해결됨)
   - OpenJDK 사용 권장
   </details>
   <br/>

## 다른 언어와의 비교

<details>
<summary>Java vs C++, Python, Kotlin</summary>

### Java vs C++

| 항목              | Java             | C++                     |
| ----------------- | ---------------- | ----------------------- |
| **메모리 관리**   | 자동 (GC)        | 수동                    |
| **플랫폼 독립성** | 높음 (JVM)       | 낮음 (컴파일 필요)      |
| **성능**          | 좋음 (JIT)       | 매우 좋음 (네이티브)    |
| **포인터**        | 없음             | 있음                    |
| **다중 상속**     | 인터페이스만     | 클래스 다중 상속 가능   |
| **용도**          | 엔터프라이즈, 웹 | 시스템 프로그래밍, 게임 |

**Java가 적합한 경우:**

- 크로스 플랫폼 애플리케이션
- 엔터프라이즈 애플리케이션
- 웹 애플리케이션

**C++이 적합한 경우:**

- 시스템 프로그래밍
- 게임 엔진
- 실시간 성능이 중요한 애플리케이션

### Java vs Python

| 항목            | Java                     | Python                    |
| --------------- | ------------------------ | ------------------------- |
| **타입 시스템** | 정적 타입                | 동적 타입                 |
| **성능**        | 빠름                     | 상대적으로 느림           |
| **코드 길이**   | 장황함                   | 간결함                    |
| **학습 곡선**   | 중간                     | 쉬움                      |
| **용도**        | 엔터프라이즈, 안드로이드 | 데이터 분석, AI, 스크립팅 |

**Java가 적합한 경우:**

- 대규모 엔터프라이즈 애플리케이션
- 안드로이드 앱 개발
- 고성능이 필요한 애플리케이션

**Python이 적합한 경우:**

- 데이터 분석 및 머신러닝
- 빠른 프로토타이핑
- 스크립팅 및 자동화

### Java vs Kotlin

| 항목            | Java                 | Kotlin                |
| --------------- | -------------------- | --------------------- |
| **호환성**      | -                    | Java와 100% 호환      |
| **Null 안전성** | 없음                 | 타입 시스템에 내장    |
| **코드 길이**   | 장황함               | 간결함                |
| **성능**        | 동일 (같은 JVM 사용) | 동일                  |
| **용도**        | 범용                 | 안드로이드, Java 대체 |

**Java가 적합한 경우:**

- 기존 Java 프로젝트 유지보수
- 넓은 생태계 활용
- 안정성 중시

**Kotlin이 적합한 경우:**

- 안드로이드 앱 개발
- 새로운 프로젝트 시작
- 간결한 코드 선호
</details>
<br/>

## 환경 설정

<details>
<summary>JDK 설치 및 환경 변수 설정</summary>

### Windows 10 환경 설정

#### 1. JDK 다운로드

- **OpenJDK 다운로드**: https://adoptium.net/ (권장)
- 또는 Oracle JDK: https://www.oracle.com/java/technologies/downloads/
- **권장 버전**: Java 17 또는 Java 21 (LTS)

#### 2. JDK 설치

- 다운로드한 설치 파일 실행
- 기본 경로: `C:\Program Files\Java\jdk-17` (버전에 따라 다름)

#### 3. 환경 변수 설정

1. **시스템 속성 열기**

   - `Win + R` → `sysdm.cpl` 입력
   - 또는 제어판 → 시스템 → 고급 시스템 설정

2. **환경 변수 설정**

   - "환경 변수" 버튼 클릭
   - "시스템 변수"에서 "새로 만들기" 클릭
   - 변수 이름: `JAVA_HOME`
   - 변수 값: JDK 설치 경로 (예: `C:\Program Files\Java\jdk-17`)

3. **PATH 변수 수정**
   - "시스템 변수"에서 `Path` 선택 → "편집" 클릭
   - "새로 만들기" 클릭 후 다음 추가:
     - `%JAVA_HOME%\bin`

#### 4. 설치 확인

```bash
# 명령 프롬프트(cmd) 또는 PowerShell에서 실행
java -version
javac -version
```

**예상 출력:**

```
java version "17.0.x" 2023-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+xx-LTS)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx-LTS, mixed mode, sharing)
```

### IDE 선택 (선택사항)

- **IntelliJ IDEA**: 가장 인기 있는 Java IDE (Community Edition 무료)
- **Eclipse**: 오픈소스 IDE
- **Visual Studio Code**: 경량 에디터 + Java 확장 프로그램
- **NetBeans**: 오픈소스 IDE

### Java 개발 환경 구성 요소

#### 필수 도구

1. **JDK (Java Development Kit)**

   - Java 개발에 필요한 모든 도구 포함
   - 컴파일러, 디버거, 문서 생성기 등

2. **IDE (통합 개발 환경)**

   - 코드 작성, 컴파일, 실행을 한 곳에서
   - IntelliJ IDEA, Eclipse 등

3. **빌드 도구**
   - Maven: 프로젝트 관리 및 의존성 관리
   - Gradle: 더 현대적인 빌드 도구

#### 개발 워크플로우

1. 소스 코드 작성 (.java)
2. 컴파일 (javac) → .class 파일 생성
3. 패키징 (jar) → 배포 단위 생성
4. 실행 (java) → JVM에서 실행
</details>
<br/>
