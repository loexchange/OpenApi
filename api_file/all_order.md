# 查询已创建订单
- 请求方式: GET
- url: https://{host}/open/api/all_order
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}&pageSize={pageSize}&page={page}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | symbol | 币对 | * |
  | time | 当前时间戳 | * |
  | pageSize | 查询数量 | 非必传 |
  | page | 页码 | 非必传 |

- 命令
```
curl -X GET https://{host}/open/api/all_order?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=266a90452a352a1c674df2e0b18cc9e9\&time=1554184381\&symbol=mkreth\&pageSize=10\&page=1
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
		"count": 6,
		"orderList": [{
			"side": "SELL",
			"total_price": "890.00000000",
			"created_at": 1553855047000,
			"avg_price": "89.00000000",
			"countCoin": "ETH",
			"source": 1,
			"type": 1,
			"side_msg": "卖出",
			"volume": "10.00000000",
			"price": "89.00000000",
			"source_msg": "WEB",
			"status_msg": "部分成交",
			"deal_volume": "5.00000000",
			"id": 115,
			"remain_volume": "5.00000000",
			"baseCoin": "MKR",
			"tradeList": [{
				"volume": "5.00000000",
				"feeCoin": "ETH",
				"price": "89.00000000",
				"fee": "0.00000000",
				"ctime": 1553808247001,
				"deal_price": "445.00000000",
				"id": 52,
				"type": "卖出"
			}],
			"status": 3
		}]
	}
}
```
