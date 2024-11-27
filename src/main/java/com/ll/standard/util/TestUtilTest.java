package com.ll.standard.util;

import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.genScanner()")

    public void t1() {
        Scanner scanner = TestUtil.getScanner("""
                등록
                나의 죽음을 적들에게 알리지 말라!
                이순신
                """.stripIndent().trim());

        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(cmd).isEqualTo("등록");
        assertThat(cmd).isEqualTo("등록");

    }
}
