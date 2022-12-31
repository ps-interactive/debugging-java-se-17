### Out of Memory

Click the "Run" button to execute the program. You will see a `java.lang.OutOfMemoryError` in the output. 

Modify the `-Xmx32m` parameter in `run.sh` to allocate more than 32 MB of memory to the java heap. For example, `-Xmx64m` would allocate a maximum of 64 MB.

Once you have adjusted the `-Xmx` value click run again to see if you allocated enough memory. If you still get an `OutOfMemoryError` continue increasing the number. If you see "Successfully completed program" then you know you allocated enough memory for the program to complete. 

