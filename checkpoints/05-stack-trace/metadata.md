# Stack Traces
Open files:
Item.java, Order.java, Program.java

# Tasks
## Description
Stack Trace error
## Instructions
Click the **Run** button to execute the program. Then read the stack trace output to determine which method to fix. Once you have fixed the error click run again to verify that the program executes without throwing an exception.
# Interface
## Tabs enabled
Enable Terminal
## Interface Settings
Enable directory sidebar
Allow command line access

## Code Editor Settings
File actions enabled
### Hidden Files/Folders Globs
**/.*
**/patterns/
**/checkpoint.md

## Terminal Settings
Clear Terminal

## Task Settings
Enable Run Checks

# Checks
## Select template
none
## Description
Stack Trace error
## Command
bash {{ test }}
## Test Contents
javac ~/workspace/com/globomantics/shipping/*.java && semgrep -f ~/workspace/patterns/rules.yaml ~/workspace/com/globomantics/shipping/Program.java
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

# Interface
## Tabs Enabled
Enable Terminal
## Interface Settings
Enable Directory Sidebar
Allow Command line access
# Interface Selection 
Default
## Code Editor Settings
File Actions Enabled
### Hidden Files/Folders Globs
**/.*
**/run.sh
**/checkpoint.md
## Terminal Settings
Clear Terminal
## Task Settings
Enable Run checks

# Settings
## GitHub Sync Settings
### Base Repository
ps-interactive/debugging-java-se-17
### Base Repository Branch
main
## GitHub File Links
### Remote Path
checkpoints/05-stack-trace/files
### Local Path
/home/nt-user/workspace
## Directories
/home/nt-user/workspace

# Toolbox
## Files
Pull Files from GitHub
