# Initialize Variable
Open files:
Item.java, Program.java

# Tasks
## Description
Initialize Variable
## Instructions
Click the **Run** button to execute the program. Identify the error from the output to determine what to fix. 

Once you have fixed the error click **Run** again to verify that the program executes without any errors.

# Checks
## Select template
none
## Description
Initialize Variable
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
## Interface Layout
Two Pane (Horizontal)
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
**/patterns
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
checkpoints/06-initialize-variable/files
### Local Path
/home/nt-user/workspace
## Directories
/home/nt-user/workspace

# Toolbox
## Files
Pull Files from GitHub


