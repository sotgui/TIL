#### # GIT 시작하기

```shell

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL
$ git init
Initialized empty Git repository in C:/Users/이지현/Desktop/GIT/TIL/.git/

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ touch README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ start README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.name 'sotgui'

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.email 'gus3779@gmail.com'

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.name
sotgui

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.email
gus3779@gmail.com

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git add .

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   README.md


이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git commit -m "first commit"
[master (root-commit) 5fdd598] first commit
 1 file changed, 2 insertions(+)
 create mode 100644 README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master
nothing to commit, working tree clean

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git remote add origin https://github.com/sotgui/TIL.git

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git push origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 219 bytes | 73.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/sotgui/TIL.git
 * [new branch]      master -> master

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ cd test

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL/test (master)
$ touch test.java

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL/test (master)
$ cd ..

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git add .

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git commit -m "test"
[master a8fca21] test
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 test/test.java

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git push origin master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 310 bytes | 103.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/sotgui/TIL.git
   5fdd598..a8fca21  master -> master

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$

```



이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL
$ git init
Initialized empty Git repository in C:/Users/이지현/Desktop/GIT/TIL/.git/

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ touch README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ start README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.name 'sotgui'

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.email 'gus3779@gmail.com'

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.name
sotgui

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git config --global user.email
gus3779@gmail.com

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        README.md

nothing added to commit but untracked files present (use "git add" to track)

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git add .

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   README.md


이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git commit -m "first commit"
[master (root-commit) 5fdd598] first commit
 1 file changed, 2 insertions(+)
 create mode 100644 README.md

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git status
On branch master
nothing to commit, working tree clean

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git remote add origin https://github.com/sotgui/TIL.git

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git push origin master
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 219 bytes | 73.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/sotgui/TIL.git
 * [new branch]      master -> master

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ cd test

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL/test (master)
$ touch test.java

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL/test (master)
$ cd ..

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git add .

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git commit -m "test"
[master a8fca21] test
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 test/test.java

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$ git push origin master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (4/4), 310 bytes | 103.00 KiB/s, done.
Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/sotgui/TIL.git
   5fdd598..a8fca21  master -> master

이지현@LAPTOP-72K5CS8M MINGW64 ~/Desktop/GIT/TIL (master)
$