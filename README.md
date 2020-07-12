# scala-webframework
Try build the HTTP server with each framework, and benchmark
## result
#### play  
```
Running 30s test @ http://0.0.0.0:9000  
12 threads and 400 connections  
Thread Stats   Avg      Stdev     Max   +/- Stdev  
    Latency     6.95ms   40.71ms   1.06s    99.07%  
    Req/Sec     9.20k     2.26k   36.48k    93.03%  
  3254956 requests in 30.09s, 375.60MB read  
Requests/sec: 108161.07  
Transfer/sec:     12.48MB  
```  
#### Colossus
```
Running 30s test @ http://0.0.0.0:9000/
  12 threads and 400 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     3.37ms    6.36ms 231.83ms   88.34%
    Req/Sec    32.28k     7.05k   69.82k    73.89%
  11577227 requests in 30.07s, 1.46GB read
Requests/sec: 384945.78
Transfer/sec:     49.56MB
```  
#### Finatra
```
Running 30s test @ http://0.0.0.0:9000
  12 threads and 400 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     6.33ms   13.42ms 483.41ms   91.26%
    Req/Sec    15.33k     4.61k   40.90k    71.85%
  5367972 requests in 30.10s, 706.46MB read
Requests/sec: 178354.66
Transfer/sec:     23.47MB
```  
