# Checks
## Select template
none
## Description
Validation error
## Command
bash {{ test }}
## Test Contents
javac *.java && semgrep -f ~/workspace/patterns/rules.yaml ~/workspace/Approval.java
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
Validation error
## Instructions
The following function checks if manager approval is needed for purchase orders. Recently the policy changed to require approval on anything above $10,000. Change the `threshold` variable so that approvals are triggered for the correct amount.

# Interface
## Code Editor Settings
### Hidden Files/Folders Globs
**/.*
**/patterns/