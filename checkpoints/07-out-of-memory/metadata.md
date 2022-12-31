# Instructions
Click the "Run" button to execute the program. You will see a `java.lang.OutOfMemoryError` in the output.

Modify the `-Xmx32m` parameter in `run.sh` to allocate more than 32 MB of memory to the java heap. For example, `-Xmx64m` would allocate a maximum of 64 MB.

Once you have adjusted the `-Xmx` value click run again to see if you allocated enough memory. If you still get an `OutOfMemoryError` continue increasing the number. If you see "Successfully completed program" then you know you allocated enough memory for the program to complete.

# Tasks
no tasks

# Checks
no checks

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
