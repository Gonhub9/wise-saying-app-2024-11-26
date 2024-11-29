package com.ll;

import com.ll.domain.system.controller.SystemController.SystemController.SystemController;
import com.ll.domain.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private final SystemController systemController;
    private final WiseSayingController wiseSayingController;

    public App(Scanner scanner) {
        this.scanner = scanner;
        this.systemController = new SystemController();
        this.wiseSayingController = new WiseSayingController(scanner);
    }

    public void run() {

        System.out.println("== 명언 앱 ==");

        label:
        while ( true ) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            // 삭제?id=3 & name=홍길동 & age=20
            // 물음표를 기준으로 좌측이 명령어, 우측이 옵션
            String[] cmdBits = cmd.split("\\?");
            String actionName = cmdBits[0];

            // return은 함수를 끝내는 것, break는 switch문 밖으로 나가는 것
            // 안하게 되면 등록이 참일 때, 명령어가 이어진다.
            switch (actionName) {
                case "종료":
                    systemController.actionExit();
                    return;
                case "등록":
                    wiseSayingController.actionAdd();
                    break;
                case "목록":
                    wiseSayingController.actionList();
                    break;
                case "삭제":
                    wiseSayingController.actionDelete(cmd);
                    break;
            }
        }
    }
}
