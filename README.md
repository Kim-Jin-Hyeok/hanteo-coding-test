지원자: 김진혁  
제출일: 2025-05-19  
---

## 프로젝트 구조
```hanteo-coding-test/
├── README.md
├── pom.xml
└── src/
    └── main/java/com/hanteo/
        ├── boardcategory/
        │   ├── Category.java
        │   ├── CategoryManager.java
        │   └── Main.java
        └── coin_combination/
            ├── Solution.java
            └── Main.java
```

## 문제 1. 게시판 카테고리 구조

Java 기반의 트리 자료구조를 구현하여, 카테고리 간의 계층 관계를 구성하고,  
ID 또는 이름 기준으로 검색한 결과를 JSON 형태로 직렬화하여 출력할 수 있도록 구현했습니다.

### 주요 기능
- `addCategory(id, name)` : 카테고리 객체 등록
- `addRelation(parentId, childId)` : 부모-자식 관계 구성
- `searchById(id)` : 특정 ID 기준으로 전체 서브트리 반환
- `searchByName(name)` : 동일 이름이 여러 번 등장하는 경우에도 전부 반환
- `hasChildren` : JSON 응답 시 하위 카테고리 존재 여부를 boolean으로 표시

### 실행 클래스
```java
com.hanteo.boardcategory.Main
```
## 문제 2. 동전 조합 수 계산
정수 배열 coins[]과 목표 금액 sum이 주어졌을 때,
동전을 무한히 사용하여 sum을 만드는 모든 조합의 수를 계산하는 프로그램입니다.
동전의 순서는 고려하지 않고, 중복 선택은 허용됩니다.

### 주요 기능
- `solution(int[] coins, int sum)` : 가능한 모든 조합의 수를 정수로 반환
- DFS 기반의 중복 조합 탐색 알고리즘 사용

동전은 정렬 후 탐색 → 중복 제거 및 조합의 일관성 유지

### 실행 클래스
```java
com.hanteo.coin_combination.Main
```

