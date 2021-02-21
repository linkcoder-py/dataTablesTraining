# TRAINING-PJT `JSP + DataTables`

### 주요 기술 스택

## 도메인 모델 설계

생략!

## 테이블 설계

생략!

## 애플리케이션 아키텍처 구성

생략!

## 개발 환경

Java version : 8

Docker h2 :

```sh
docker run -d -p 1521:1521 -p 81:81 -v /Users/c0re/Documents/lab/dataTablesTraining/data_dir:/opt/h2-data -e H2_OPTIONS='-ifNotExists' --name=datatables.h2DB oscarfonts/h2
```

주의 : 로컬 주소 입력시 상대경로 ``X``

접속 : http://localhost:81

