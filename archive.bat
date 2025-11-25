@echo off
:: Usage: archive "Category\ProblemName"

if "%~1"=="" (
    echo [USAGE] archive Category\ProblemName
    exit /b
)

set "TARGET_DIR=%~1"

:: 1. Check if Main.java exists before doing anything
if not exist "Main.java" (
    echo [ERROR] Main.java does not exist in this folder!
    echo [TIP] Create and save Main.java before archiving.
    exit /b
)

:: 2. Create the directory structure
if not exist "%TARGET_DIR%" mkdir "%TARGET_DIR%"

:: 3. Move Main.java (SAFE MOVE)
:: We use quotes to handle paths safely
move "Main.java" "%TARGET_DIR%\Main.java"

:: 4. Check if the move actually worked
if %errorlevel% neq 0 (
    echo [FATAL] Failed to move file! It might be locked or open.
    echo [ACTION] Aborting. Your code is safe in Main.java.
    exit /b
)

echo [SUCCESS] Moved Main.java to %TARGET_DIR%\

:: 5. Create a fresh Main.java with Boilerplate
(
    echo import java.io.*;
    echo import java.util.Scanner;
    echo import java.lang.Math;
    echo import java.util.Arrays;
    echo.
    echo public class Main {
    echo     public static void main(String[] args^) {
    echo         Scanner sc = new Scanner(System.in^);
    echo     }
    echo }
) > Main.java

