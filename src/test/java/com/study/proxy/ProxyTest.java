package com.study.proxy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

import com.study.proxy.ex.*;

/**
 * <pre>
 * description : 
 * packageName : com.study.proxy
 * fileName    : ProxyTest
 * author      : limju
 * date        : 2024 11월 18
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2024 11월 18   limju       최초 생성
 *
 * </pre>
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ProxyTest {
    @Test
    public void printTest() {
        IPrinter printer = new Printer("samsung");
        String message = "첫번째 출력";
        String printChars = printer.print(message);
        
        String expected = "<samsung>" + message + "</samsung>";
        assertEquals(expected, printChars);

        IPrinter printer2 = new PrinterProxy("samsung", new LogAspect());
        printChars = printer2.print(message);

        expected = "<samsung>" + message + "</samsung>";
        assertEquals(expected, printChars);

        IPrinter printer3 = new PrinterProxy("samsung", new LogAspect(), new AuthenticAspect());
        printChars = printer3.print(message);

        expected = "<samsung>" + message + "</samsung>";
        assertEquals(expected, printChars);
    }

        @Test
        public void void_mockito_test() {
            IAspect logAspect = mock(IAspect.class);
            IAspect authenticAspect = mock(AuthenticAspect.class);
            String message = "첫번째 출력";
            
            IPrinter printer = new PrinterProxy("samsung", logAspect, authenticAspect);
            String printChars = printer.print(message);
            
            String expected = "<samsung>" + message + "</samsung>";
            assertEquals(expected, printChars);
            verify(logAspect, times(1)).before();
            verify(authenticAspect, times(1)).before();
            verify(logAspect, times(1)).after();
            verify(authenticAspect, times(1)).after();
        }
}
