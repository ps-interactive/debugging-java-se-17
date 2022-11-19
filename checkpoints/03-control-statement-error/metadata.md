# Checks
## Select template
none
## Description
Control Statement error
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
Control Statement error
## Instructions
The following function should return the `ERROR_MESSAGE` if the `actualWeight` is greater than the `MAX_WEIGHT`. Otherwise it should return the `OK_MESSAGE`.
# Interface
## Code Editor Settings
### Hidden Files/Folders Globs
**/.*
**/patterns/