# Tucil3_13522060
UCS, Greedy Best First Search, and A* Algorithms in Solving Word Ladder Game

## Table of Contents
* [General Information](#general-information)
* [Creator](#creator)
* [Features](#features)
* [Requirements](#requirements)
* [How to Run](#how-to-run)
* [Repository Structure](#repository-structure)

## General Information
Program ini menggunakan Algoritma UCS, Greedy Best First Search, and A* untuk menyelesaikan persoalan pencarian lintasan dari dua kata dengan aturan permainan Word Ladder.

## Creator
| NIM      | Nama                    | Kelas                                                                                                                                                                                                               |
|----------|-------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 13522060 | Andhita Naura Hariyanto    | K-02                                                              |

## Features
- Menampilkan solusi Permainan Word Ladder dengan algoritma A* atau UCS atau Greedy Best First Search.

## Requirements
Anda harus menginstall bahasa Java untuk menjalankan program ini.

## How to Run
1. Buka terminal and clone repository berikut (https://github.com/andhitanh/Tucil3_13522060.git)

2. Buka folder src dengan menjalankan command berikut pada folder utama di
```
cd src
```

3. Kompilasi program

```
javac -d ..\bin Algorithm/*.java Util/*.java Main.java
```
4. Jalankan program utama dengan perintah berikut

```
java Main.java
```
1. Apabila menggunakan windows bisa run dengan perintah berikut tanpa menjalankan 4 langkah di atas

```
./run.bat
```

## Repository Structure
```
+---bin
|
+---doc
|       Tucil3_13522060.pdf
|
+---lib
|       Dictionary.txt
|
+---src
+----------Algorithm                
|               Astar.java
|               GBFS.java
|               UCS.java
+----------Util                
|               DictionaryChecker.java
|               Input.java
|               Node.java
|               Result.java
|       Main.java
|
+---test
|       testcase1.txt
|       testcase2.txt
|       testcase3.txt
|       testcase4.txt
|       testcase5.txt
|       testcase6.txt
```