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
#### scalatra
```
Running 30s test @ http://0.0.0.0:9000
  12 threads and 400 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     7.08ms   25.17ms 652.71ms   97.73%
    Req/Sec     9.02k     3.04k   25.23k    76.50%
  3222987 requests in 30.08s, 470.27MB read
Requests/sec: 107134.98
Transfer/sec:     15.63MB
```  
#### Akka
```
Running 30s test @ http://0.0.0.0:9000/
  12 threads and 400 connections
  Thread Stats   Avg      Stdev     Max   +/- Stdev
    Latency     5.88ms   35.75ms 981.81ms   99.06%
    Req/Sec    12.48k     2.93k   42.90k    83.80%
  4347115 requests in 30.09s, 638.44MB read
Requests/sec: 144452.89
Transfer/sec:     21.22MB
```  
