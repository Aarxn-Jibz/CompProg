@echo off
:: Usage: archive "Category\ProblemName"

if "%~1"=="" (
    echo Usage: archive Category\ProblemName
    exit /b
)

set "TARGET_DIR=%~1"

:: 1. Create the directory structure (-p equivalent)
if not exist "%TARGET_DIR%" mkdir "%TARGET_DIR%"

:: 2. Move Main.java
if exist Main.java (
    move Main.java "%TARGET_DIR%\Main.java"
    echo [OK] Moved Main.java to %TARGET_DIR%\
    
    :: 3. Create a fresh Main.java with Boilerplate
    (
        echo import java.io.*;
        echo import java.util.*;
        echo.
        echo public class Main {
        echo     public static void main(String[] args^) {
        echo         Scanner sc = new Scanner(System.in^);
        echo     }
        echo }
    ) > Main.java
    echo [NEW] Fresh Main.java created.
    
    :: 4. Re-open Neovim immediately (Optional)
    nvim Main.java
) else (
    echo [ERROR] No Main.java found in current folder!
)
