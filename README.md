# JGroupEcacheTree
Ehcache 分布式本地缓存


<pre>
Ehcache是一个纯Java的进程内缓存框架。
由于Ehcache是进程内的缓存系统，一旦将应用部署在集群环境中，每个节点维护各自的缓存数据，当某
个节点对缓存数据进行更新，这些 更新的数据无法在其他节点中共享，这不仅会降低节点运行的效率，
而且会导致数据不同步的情况发生，所以就需要用到EhCache的集群解决方案：
    Ehcache支持5中集群方案：
        1）RMI
        2）JMS
        3) JGroups
        5) EhCache Server

    JGroups 提供了基于TCP的淡薄和基于UDP的多播，对应RMI的手工配置和自动发现。
</pre>