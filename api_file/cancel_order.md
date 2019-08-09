# 取消单个订单
- 请求方式: POST
- url: https://{host}/open/api/cancel_order
- 传入参数 
```
api_key={api_key}&time={time}&sign={sign}&symbol={symbol}&order_id={order_id}
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
curl -X POST https://{host}/open/api/cancel_order?api_key=1764ddfe62ab365092296ad8272df4f9\&sign=d60d07da62d733023fa89887615fd181\&time=1554186248\&symbol=mkreth\&order_id=1
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
