/**
 * Java 첫 번째 프로그램 - Hello World
 * 
 * 이 프로그램은 Java의 기본 구조를 보여주는 간단한 예제입니다.
 * 
 * @author 학습자
 * @version 1.0
 */
public class HelloWorld {
    
    /**
     * 프로그램의 진입점 (Entry Point)
     * JVM이 프로그램을 실행할 때 가장 먼저 호출하는 메서드
     * 
     * @param args 명령줄 인수 (Command Line Arguments)
     */
    public static void main(String[] args) {
        // 콘솔에 메시지 출력
        System.out.println("Hello, World!");
        System.out.println("Java 학습을 시작합니다!");
        
        // 명령줄 인수가 있는 경우 출력
        if (args.length > 0) {
            System.out.println("전달된 인수: " + args[0]);
        }
    }
}

