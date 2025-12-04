Distributed Systems Labs 
-----------------------------------------------------------
1. Java RMI – Remote Method Invocation

Tools: Java, RMI Registry
Objective: Build remote communication between client and server using remote method calls.
Global Structure:

/server – remote service implementation

/client – client invoking remote methods

/shared – interfaces and remote objects

-----------------------------------------------------------

2. CORBA – Common Object Request Broker Architecture

Tools: Java, IDL, ORB
Objective: Implement distributed components communicating through an Object Request Broker using IDL interfaces.
Global Structure:

/idl – interface definitions

/server – CORBA server implementing IDL

/client – client interacting with the ORB

-----------------------------------------------------------

3. Distributed Sockets

Tools: Java/Python, TCP/UDP
Objective: Practice low-level network communication with socket-based message exchange.
Global Structure:

/server – socket server

/client – message sender/receiver

/utils – helpers and serialization

-----------------------------------------------------------

4. RPC – Remote Procedure Call

Tools: Python/Java RPC Frameworks
Objective: Execute remote functions transparently using stubs and skeletons.
Global Structure:

/service – RPC server implementation

/client – remote procedure calls

/protocol – communication + serialization logic

-----------------------------------------------------------

5. Spark SQL

Tools: Apache Spark, PySpark
Objective: Query and process large datasets using distributed SQL operations.
Global Structure:

/notebooks – SQL queries & transformations

/datasets – input data

/jobs – Spark scripts

-----------------------------------------------------------

6. Hadoop HDFS + MapReduce

Tools: Hadoop, HDFS, MapReduce API
Objective: Understand distributed storage and parallel data processing over large datasets.
Global Structure:

/hdfs – scripts to upload/manage files

/mapreduce – mapper & reducer code

/output – execution results

-----------------------------------------------------------

7. GraphX (Distributed Graph Processing)

Tools: Spark GraphX, Scala/Python
Objective: Analyze large graphs using distributed algorithms such as PageRank.
Global Structure:

/graphs – input graphs

/algorithms – graph computations

/results – outputs & metrics

-----------------------------------------------------------

8. Kafka – Distributed Event Streaming

Tools: Apache Kafka, Zookeeper
Objective: Implement a distributed messaging and streaming pipeline with producers and consumers.
Global Structure:

/producer – event/message producer

/consumer – consumer reading streams

/config – Kafka topics & server configs
