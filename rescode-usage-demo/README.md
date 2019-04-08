###Step 1 ：申请码

###Step 2 ：将码放入枚举类
参见：

DemoDubboResultCode for Dubbo Service

DemoRestResultCode for Rest service.


###Step 3 ：在Dubbo服务中使用码
>#####正常返回
在返回结果时，将码放入Response中 （见DemoServiceImpl)

>#####异常返回
抛出异常时，将码放入Exception中 （见DemoServiceImpl)。 此异常会被异常处理器（DemoDubboExceptionHandler)统一处理，并组装成Response然后返回给调用端。

###Step 4 ：在Rest服务中使用码
>#####正常返回
在返回结果时，将码放入Response中 （见DemoController)

>#####异常返回
抛出异常时，将码放入Exception中 （见DemoController)。 此异常会被异常处理器（DemoRestExceptionHandler)统一处理，并组装成Response然后返回给调用端。






