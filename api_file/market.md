# 查询所有币对最新成交价
- 请求方式: GET
- url: https://{host}/open/api/market
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | time | 当前时间戳 | * |

- 命令
```
curl -X GET https://{host}/open/api/market?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=f12a311f9d0afa0e4e7dd6c6c65aeb66\&time=1554189132
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
		"btcusdt": 3800.0,
		"mkrbtc": 0.177235,
		"ethbtc": 0.035456
	}
}
```
