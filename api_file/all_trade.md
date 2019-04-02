# 查询成交记录
- 请求方式: GET
- url: https://{host}/open/api/all_trade
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}&sort={sort}&pageSize={pageSize}&page={page}
```
- 入参说明

  | 字段名 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | symbol | 币对 | * |
  | time | 当前时间戳 | * |
  | sort | 排序 | 0 正序 1 倒序 非必传 |
  | pageSize | 查询数量 | 非必传 |
  | page | 页码 | 非必传 |

- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    
- 命令
```
curl -X GET https://{host}/open/api/all_trade?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=266a90452a352a1c674df2e0b18cc9e9\&time=1554184381\&symbol=mkreth\&pageSize=10\&page=1
```
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"count": 6,
		"resultList": [{
			"side": "SELL",
			"ask_user_id": 2,
			"fee": "0.00000000",
			"deal_price": "2.48179933",
			"type": "卖出",
			"bid_id": 1,
			"ask_id": 2,
			"volume": "0.500",
			"feeCoin": "ETH",
			"price": "4.96359866",
			"ctime": 1551812066276,
			"id": 1,
			"bid_user_id": 2
		}]
	}
}
```
