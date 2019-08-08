# 创建订单
- 请求方式: POST
- url: https://{host}/open/api/create_order
- 传入参数 
```
volume={volume}&symbol={symbol}&side={side}&api_key={api_key}&price={price}&sign={sign}&time={time}&type={type}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | api_key | 接口钥匙 | * |
  | sign | 签名数据 | * |
  | symbol | 币对 | * |
  | time | 当前时间戳 | * |
  | volume | 数量 | * |
  | side | 买卖 | * BUY或SELL |
  | type | 挂单类型 | 1:限价交易 2:市价交易 |
  | price | 价格 | type=2时非必传 |

- 命令
```
curl -X POST https://{host}/open/api/create_order?api_key=1764ddfe62ab365092296ad8272df4f9\&volume=0.1\&symbol=mkreth\&side=BUY\&price=0.01\&sign=127b510d23c101501fe767db42b6de4b\&time=1554186684\&type=1
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
