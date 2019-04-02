# 查询币对行情
- 请求方式: GET
- url: https://{host}/open/api/get_ticker
- 传入参数 
```
symbol={symbol}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | symbol | 币对 | * |


- 命令
```
curl -X GET https://{host}/open/api/get_ticker?symbol=mkreth
```

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"high": 89.0,
		"vol": 0.0,
		"last": "89.0000000000000000",
		"low": 89.0,
		"buy": "50.55000000",
		"rose": 0.0,
		"time": 1554188632859
	}
}
```
