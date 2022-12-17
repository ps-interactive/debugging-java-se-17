# Checks
## Select template
none
## Description
Readable Code
## Command
bash {{ test }}
## Test Contents
javac *.java && semgrep -f ~/workspace/patterns/rules.yaml ~/workspace/Program.java
## Failed Pattern
0 findings
## Filename Override
nt-test-create
## Build first
False (not checked)
## Require Success 
True (checked)
## Advanced Settins
### Timeout
60

# Tasks
## Description
Readable Code
## Instructions

# Interface
## Code Editor Settings
### Hidden Files/Folders Globs
**/.*
**/patterns/

# Settings
## GitHub Sync Settings
### Base Repository
ps-interactive/debugging-java-se-17
### Base Repository Branch
main
## GitHub File Links
### Remote Path
checkpoints/04-readable-code/files
### Local Path
/home/nt-user/workspace
## Directories
/home/nt-user/workspace

# Toolbox
## Files
Pull Files from GitHub

# Test Code
public static void main(String[] args) {
    System.out.println(checkBoundary(4));
    System.out.println(checkBoundary(10));
    System.out.println(checkBoundary(16));
}