# flume-spooldir-recursive-source
flume-spooldir-recursive-source

1 防止读取写未完成的文件，增加时间限制，当前时间-文件最近一次修改时间< AFTER_MODIFIED 的都不在扫描范围内

2 支持目录递归扫描

3 支持删除超过期限的时间格式的空目录
