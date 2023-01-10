# Out of Memory
Open files: 
Program.java, run.sh

# Tasks
## Description
Out of Memory
## Instructions
Click the **Run** button to execute the program. You will see a `java.lang.OutOfMemoryError` in the output.

Modify the `-Xmx32m` parameter in `run.sh` to allocate more than 32 MB of memory to the java heap. For example, `-Xmx64m` would allocate a maximum of 64 MB.

Once you have adjusted the `-Xmx` value 

1. Click this checkbox to validate you fixed the issue and
2. Click **Run** again to see the output. 
 
If the validation fails and you still get an `OutOfMemoryError` continue increasing the allocation. If you see `Successfully completed program` then you know you have allocated enough memory for the program to complete.

Sometimes it is useful to follow a doubling approach, e.g. 32, 64, 128, 256 until you have enough memory. You can then further tune within that range if needed.

## Linked Checks
Custom Test

< no feedback >
## Live
true
## Same Directory 
true

# Checks
## Select template
none
## Description
Test for enough memory
## Command
bash {{ test }}
## Test Contents
bash com/globomantics/shipping/run.sh
## Failed Pattern
OutOfMemoryError
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
checkpoints/07-out-of-memory/files
### Local Path
/home/nt-user/workspace
## Directories
/home/nt-user/workspace

# Toolbox
## Files
Pull Files from GitHub
