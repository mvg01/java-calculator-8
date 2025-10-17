# java-calculator-precourse

## ✅ 실행 환경 확인
- [x] Java 버전 21로 실행 확인 (`java -version → 21 출력`)
- [x] IntelliJ/Gradle JVM 모두 21로 설정 (`.\gradlew.bat --version`)
- [x] `.\gradlew.bat clean test` 실행 시 **BUILD SUCCESSFUL** 확인

---

## 📦 저장소 준비
- [x] 미션 저장소 포크 및 로컬 클론 완료
- [x] 원격 **upstream 등록** 및 **최신 변경사항 동기화 설정 완료**

---

## 💾 커밋 운용
- [x] `README.md`에 기능 목록 작성 완료
- [x] 기능 단위 커밋 진행 (`feat`, `fix`, `refactor` 등 **Angular 컨벤션 적용**)

---

## ⚙️ 기능 요구 사항
- [x] **빈 문자열 입력 시 0 반환**
- [x] **기본 구분자 (, :)** 로 분리된 **양수의 합 계산**
- [x] **커스텀 구분자** `//X\n` 형태 지원 (예: `//;\n1;2;3 → 6`)
- [x] **잘못된 입력 시** `IllegalArgumentException` 발생 후 프로그램 종료

---

## 💬 입출력 요구
- [ ] 입력이 **구분자와 양수로만 구성됨**을 검증
- [x] 출력 형식 **정확히 `"결과 : N"`** 으로 일치

---

## 💻 프로그래밍 요구
- [x] 진입점 **`Application.main()`** 사용
- [x] **`build.gradle` 수정 금지**, 외부 라이브러리 미사용
- [x] **`System.exit()` 호출 금지**
- [x] **파일/패키지 명 변경 없음**
- [x] **Java Style Guide** 준수 (포맷, 네이밍, 컨벤션)

---

## 📚 라이브러리 사용
- [x] 입력은 **`camp.nextstep.edu.missionutils.Console.readLine()`** 사용

---

## 🧪 테스트 실행
- [x] Windows 기준 `gradlew.bat clean test` 전체 통과
- [x] **모든 테스트 성공** (실패 시 0점 규정 숙지)

---

## 📅 일정 및 제출
- [x] **다음 주 월요일 전 구현 완료**
- [ ] **일요일 15시 이후 제출 가능**
- [ ] GitHub에 **PR 제출 후**, **우테코 지원 플랫폼에 PR 링크 최종 제출**

---
