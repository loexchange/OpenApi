# 查询买卖盘深度
- 请求方式: GET
- url: https://{host}/open/api/market_dept
- 传入参数 
```
symbol={symbol}&type={type}
```
- 入参说明

  | 字段名称 | 数据类型 | 说明 |
  | --- | --- | --- |
  | symbol | 币对 | * |
  | type | 类型 | *step0、step1、step2 |

- 命令
```
curl -X GET https://{host}/open/api/market_dept?symbol=mkreth\&type=step0
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
		"tick": {
			"asks": [],
			"bids": [
				["50.55000000", 0.50000000],
				["31.00000000", 1.00000000],
				["30.00000000", 0.90000000],
				["29.00000000", 0.40000000],
				["14.00000000", 0.44340000]
			],
			"time": null
		}
	}
}
```
