# Batch Processing Using Spring boot
![alt text](https://github.com/roulupen/spring-batch-demo/blob/master/SpringBatch%20Architecture.JPG?raw=true)

#### This demo uses in memory H2 database for tracking the batch details and as part of batch processing it reads a CSV file present in resource directory and saves the content into the H2 database.

*** NOTE: The CSV file path is absolute if anyone copying this code for testing need to change the file path in application.properties.

#### Sample queries for checking if records saved into H2 database or not and checking batchjob status.

- select * FROM USER;
- select * from BATCH_JOB_EXECUTION;
- select * from BATCH_STEP_EXECUTION;
- select * from BATCH_JOB_INSTANCE;
- select * FROM BATCH_JOB_EXECUTION_CONTEXT;
- select * FROM BATCH_STEP_EXECUTION_CONTEXT;
- select * FROM BATCH_JOB_EXECUTION_PARAMS;

* http://localhost:8081/h2-console/ : For checking h2 database console.
* http://localhost:8081/load : Load data from CSV to database.


References:
- https://www.youtube.com/watch?v=1XEX-u12i0A
