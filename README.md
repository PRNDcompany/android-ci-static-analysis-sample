# Android CI Static Analysis Sample

이 프로젝트는 Android 개발에서 정적 코드 분석을 자동화하는 방법을 학습할 수 있는 예시 프로젝트입니다.

## 📋 프로젝트 개요

이 저장소는 다음 두 가지 Medium 블로그 글의 예시 코드를 제공합니다:

### 1. [detekt + reviewdog으로 정적 코드 분석 자동화하기](https://medium.com/@galcyurio/sonarqube-cloud%EC%97%90%EC%84%9C-detekt-reviewdog%EC%9C%BC%EB%A1%9C-%EC%A0%84%ED%99%98%ED%95%9C-%EC%9D%B4%EC%9C%A0-9c492638af5d)
- **목적**: CI/CD 파이프라인에서 Kotlin 코드 품질을 자동으로 검사하고 PR에 리뷰 자동화
- **도구**: detekt (정적 분석) + reviewdog (리뷰 자동화)
- **학습 브랜치**: `step0` ~ `step4-3`

### 2. [detekt에 custom rule 추가하기](https://medium.com/@galcyurio/detekt-reviewdog%EC%9C%BC%EB%A1%9C-%EC%A0%95%EC%A0%81-%EC%BD%94%EB%93%9C-%EA%B2%80%EC%82%AC-%EC%9E%90%EB%8F%99%ED%99%94%ED%95%98%EA%B8%B0-d7b521da5023)
- **목적**: 프로젝트별 특수한 코딩 규칙을 detekt에 추가하는 방법
- **내용**: 커스텀 룰 작성 및 적용 방법
- **학습 브랜치**: `custom-rule-start`, `custom-rule-end`

## 🏗️ 프로젝트 구조

```
android-ci-static-analysis-sample/
├── app/                    # 메인 Android 앱 모듈
├── apple/                  # 예시 라이브러리 모듈 1
├── banana/                 # 예시 라이브러리 모듈 2
├── code-quality/           # 커스텀 detekt 룰 모듈
├── gradle/
│   └── libs.versions.toml  # 의존성 버전 관리
└── build.gradle.kts        # 루트 빌드 설정
```

## 🚀 시작하기

### 1. 정적 분석 자동화 학습하기

각 단계별로 브랜치를 체크아웃하여 학습하세요:

```bash
# 기본 설정부터 시작
git checkout step0

# 단계별로 진행
git checkout step1
git checkout step2
git checkout step3
git checkout step4-1
git checkout step4-2
git checkout step4-3
```

### 2. custom rule 학습하기

```bash
# custom rule 시작점
git checkout custom-rule-start

# 완성된 custom rule
git checkout custom-rule-end
```

## 🛠️ 기술 스택

- **Language**: Kotlin
- **Build Tool**: Gradle (Kotlin DSL)
- **Static Analysis**: detekt
- **CI/CD**: GitHub Actions
- **Review Automation**: reviewdog

## 📖 참고 자료

### 블로그 글
- [SonarQube Cloud에서 detekt + reviewdog으로 전환한 이유](https://medium.com/@galcyurio/sonarqube-cloud%EC%97%90%EC%84%9C-detekt-reviewdog%EC%9C%BC%EB%A1%9C-%EC%A0%84%ED%99%98%ED%95%9C-%EC%9D%B4%EC%9C%A0-9c492638af5d)
- [detekt + reviewdog으로 정적 코드 검사 자동화하기](https://medium.com/@galcyurio/detekt-reviewdog%EC%9C%BC%EB%A1%9C-%EC%A0%95%EC%A0%81-%EC%BD%94%EB%93%9C-%EA%B2%80%EC%82%AC-%EC%9E%90%EB%8F%99%ED%99%94%ED%95%98%EA%B8%B0-d7b521da5023)

### 공식 문서
- [detekt 공식 문서](https://detekt.dev/)
- [reviewdog 공식 문서](https://github.com/reviewdog/reviewdog)
- [GitHub Actions 문서](https://docs.github.com/en/actions)

## 🤝 기여하기

이 프로젝트는 학습 목적으로 만들어졌습니다. 개선사항이나 질문이 있으시면 이슈를 등록해 주세요.

## 📝 라이선스

이 프로젝트는 교육 목적으로 제공됩니다.
