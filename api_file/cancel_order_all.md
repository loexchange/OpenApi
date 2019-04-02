# 取消全部订单
- 请求方式: POST
- url: https://{host}/open/api/cancel_order_all
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | symbol | 币对 | * |
  | time | 当前时间戳 | * |

- 命令
```
curl -X POST https://localhost:8080/exchange-open-api/open/api/cancel_order_all?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=e432bf3286e8af7f65a7957f8b659dc3\&time=1554185838\&symbol=mkreth
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
	"data": null
}
```
