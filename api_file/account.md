# 查询个人资产信息
- 请求方式: GET
- url: https://{host}/open/api/user/account
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
curl -X GET https://{host}/open/api/user/account?sign=a7c476df2de02811166cda6edb20869a&api_key=1764ddfe62ab365092296ad8272df4f9&time=1554178351
```
- 返回信息

    | 字段名 | 数据类型 | 说明 |
    | --- | --- | --- |
    | code | 编码 | 0=成功，否则失败 |
    | msg | 内容 | suc=成功，否则返回具体信息 |
    | total_asset | 总资产 | 转换成功BTC后的资产 |
    | normal | 正常余额 | 可用余额 |
    | btcValuatin | 折合资产 | 折合成BTC后的资产 |
    | locked | 冻结资产 | 被冻结的资产，无法使用 |
    | coin | 币种 | &nbsp; |
    
- 示例
```
{
	"code": "0",
	"msg": "suc",
	"data": {
		"total_asset": "12270.21335696",
		"coin_list": [{
			"normal": "10519.66036000",
			"btcValuatin": "373.08510973",
			"locked": "2.82130000",
			"coin": "eth"
		} {
			"normal": "10095.74398000",
			"btcValuatin": "10100.00000000",
			"locked": "4.25602000",
			"coin": "btc"
		}]
	}
}
```
