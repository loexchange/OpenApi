# 查询开放币对信息
- 请求方式: GET
- url: `https://{host}/open/api/common/symbols`
- 传入参数   `无`
- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    | symbol | 币对 | 由basecoin + countcoin组成 |
    | count_coin | 数量币种 | 卖方币种 |
    | base_coin | 价格币种 | 买方币种 |

- 命令
```
curl -X GET http://{host}/open/api/common/symbols
```

- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": [{
		"symbol": "ethlcny",
		"count_coin": "LCNY",
		"amount_precision": 4,
		"base_coin": "ETH",
		"price_precision": 8
	}, {
		"symbol": "btclcny",
		"count_coin": "LCNY",
		"amount_precision": 8,
		"base_coin": "BTC",
		"price_precision": 8
	}]
}
```
