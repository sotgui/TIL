## Git 명령어.zip

#### * 내 컴퓨터에서 최초로 깃-깃허브 매핑시켜 줄 때

1. `git config --global user.name '<username>' ` : username 등록
   * 잘 들어갔는지 확인 : `git config --global user.name`
2. `git config --global user.email '<email>' ` : email 등록
   * 잘 들어갔는지 확인 : `git config --global user.email`



##### * Working Directory (내 로컬에서 폴더 만들었을 때만 1회)

1. `git init` : git 시작
2. `git remote add origin <git repo url>` : repo 연결

##### * Staging Area(.git) *N회*

* `git remote` : remote 별명 확인
* `git remote -v` : remote 주소 확인
* `git add . ` : `.` 전부 다!
* `git add 파일명.확장자` : 특정 파일만 업로드
* `git status` : `add` 가 잘 됐는지 확인
* `git commit -m '<commit message>'` : why commit 했는지 적어 줌
* `git push` : github에 올리기



#### pull/clone

* `git clone <git url>`
* `git pull <git url>`



