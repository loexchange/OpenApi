# 查询成交记录
- 请求方式: GET
- url: https://{host}/open/api/get_trades
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
curl -X GET https://{host}/open/api/get_trades?symbol=mkreth
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
	"data": [{
		"amount": 5.0000000000000000,
		"price": 89.0000000000000000,
		"id": 52,
		"type": "sell"
	}]
}
```
