# 查询订单详情
- 请求方式: GET
- url: https://{host}/open/api/order_info
- 传入参数 
```
api_key={api_key}&order_id={order_id}&symbol={symbol}&time={time}&sign={sign}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | symbol | 币对 | * |
  | time | 当前时间戳 | * |
  | order_id | 订单Id | * |

- 命令
```
curl -X GET https://{host}/open/api/order_info?symbol=mkreth&api_key=1764ddfe62ab365092296ad8272df4f9&sign=eba1eb0b4d499a2a030dcd22697a7a16&time=1554183546&order_id=1
```
- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    | trade_list | 交易列表 | &nbsp; |
    | order_info | 订单信息 | &nbsp; |
    | volume | 数量 | &nbsp; |
    | price | 价格 | &nbsp; |
    | fee | 手续费 | &nbsp; |
    | deal_price | 交易额 | &nbsp; |
    | total_price | 总额 | &nbsp; |
    | created_at | 创建时间 | &nbsp; |
    | total_price | 总额 | &nbsp; |
    | remain_volume | 剩余数量 | &nbsp; |

- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"trade_list": [{
			"volume": "0.50000000",
			"feeCoin": "MKR",
			"price": "4.96359866",
			"fee": "0.00000000",
			"ctime": 1551812066276,
			"deal_price": "2.48179933",
			"id": 1,
			"type": "买入"
		}, {
			"volume": "0.50000000",
			"feeCoin": "MKR",
			"price": "4.96359866",
			"fee": "0.00000000",
			"ctime": 1551812159755,
			"deal_price": "2.48179933",
			"id": 2,
			"type": "买入"
		}],
		"order_info": {
			"side": "BUY",
			"total_price": "4.96359866",
			"created_at": 1551862559000,
			"avg_price": "4.96359866",
			"countCoin": "ETH",
			"source": 1,
			"type": 1,
			"side_msg": "买入",
			"volume": "1.00000000",
			"price": "4.96359866",
			"status_msg": "完全成交",
			"deal_volume": "1.00000000",
			"id": 1,
			"remain_volume": "0.00000000",
			"baseCoin": "MKR",
			"tradeList": [{
				"volume": "0.50000000",
				"feeCoin": "MKR",
				"price": "4.96359866",
				"fee": "0.00000000",
				"ctime": 1551812066276,
				"deal_price": "2.48179933",
				"id": 1,
				"type": "买入"
			}, {
				"volume": "0.50000000",
				"feeCoin": "MKR",
				"price": "4.96359866",
				"fee": "0.00000000",
				"ctime": 1551812159755,
				"deal_price": "2.48179933",
				"id": 2,
				"type": "买入"
			}],
			"status": 2
		}
	}
}
```
