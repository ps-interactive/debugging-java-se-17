# Checks
## Select template
none
## Description
Syntax error
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
Syntax error
## Instructions
Fix the syntax error in the code so that it will compile.

# Interface
## Code Editor Settings
### Hidden Files/Folders Globs
**/.*
**/patterns/