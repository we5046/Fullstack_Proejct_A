# Fullstack Project A

Spring Legacy 기반 백엔드와 Vue 3 기반 프론트엔드를 함께 구성한 풀스택 학습 프로젝트입니다. 게시판, 인증, 갤러리, 여행 페이지 등 웹 서비스의 기본 흐름을 프론트엔드와 REST API 구조로 나누어 구현합니다.

## 프로젝트 구조

```text
09_Spring+Vue/
└── scoula/
    ├── backend/                 # Spring MVC / Spring Security / MyBatis 백엔드
    │   ├── src/main/java/        # controller, service, mapper, security, config
    │   ├── src/main/resources/   # MyBatis XML, application.properties, log 설정
    │   ├── src/test/java/        # JUnit 테스트
    │   ├── build.gradle          # Gradle 빌드 설정
    │   └── api.http              # API 테스트 요청
    │
    └── frontend/                # Vue 3 / Vite 프론트엔드
        ├── src/
        │   ├── pages/            # auth, board, gallery, travel 화면
        │   ├── router/           # 라우터 설정
        │   ├── components/       # 공통 레이아웃 컴포넌트
        │   ├── stores/           # Pinia 상태 관리
        │   └── config/           # 프론트엔드 설정
        ├── package.json          # npm 스크립트 및 의존성
        └── vite.config.js        # Vite 설정
```

## 기술 스택

- Backend: Java 17, Spring MVC 5.3, Spring Security, MyBatis, MySQL, Gradle
- Frontend: Vue 3, Vite, Vue Router, Pinia, Axios, Bootstrap
- Test: JUnit 5, Spring Test

## 실행 방법

### Backend

```sh
cd 09_Spring+Vue/scoula/backend
./gradlew build
```

### Frontend

```sh
cd 09_Spring+Vue/scoula/frontend
npm install
npm run dev
```
