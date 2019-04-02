# 获取K线数据
- 请求方式: GET
- url: https://{host}/open/api/get_records
- 传入参数 
```
symbol={symbol}&period={period}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | symbol | 币对 | * |
  | period | 类型 | 1、5、15、30、60 (分钟) |

- 命令
```
curl -X GET https://{host}/open/api/get_records?symbol=mkreth\&period=1
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    | data | time、open、high、low、close、vol | |
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": [
		[1554170160, 89.00000000, 89.00000000, 89.00000000, 89.00000000, 0]
	]
}
```
